"""
AI Product Intelligence System — Source Modules
================================================
Task 1: Smart Recommendation Engine
Task 2: Unique Catalog Deduplication
Task 3: Reverse Text Search
"""

import numpy as np
import torch
from sklearn.preprocessing import normalize
from sklearn.metrics.pairwise import cosine_similarity, cosine_distances
from sklearn.cluster import DBSCAN
from transformers import CLIPModel, CLIPProcessor
from sentence_transformers import SentenceTransformer

# ─── COMPLEMENTARY CATEGORY MAP (Task 1) ────────────────────────────────────
COMPLEMENTARY_MAP = {
    'Footwear':    ['Socks', 'Sportswear', 'Accessories', 'Bottomwear'],
    'Topwear':     ['Bottomwear', 'Accessories', 'Footwear'],
    'Bottomwear':  ['Topwear', 'Footwear', 'Belts', 'Accessories'],
    'Accessories': ['Topwear', 'Watches', 'Footwear'],
    'Watches':     ['Accessories', 'Topwear', 'Footwear'],
    'Sportswear':  ['Footwear', 'Accessories', 'Socks'],
    'Bags':        ['Accessories', 'Topwear', 'Footwear'],
    'Innerwear':   ['Topwear', 'Bottomwear'],
}


class ProductIntelligenceSystem:
    def __init__(self, device=None):
        self.device = device or ('cuda' if torch.cuda.is_available() else 'cpu')
        print(f'Loading models on {self.device}...')
        self.clip_model = CLIPModel.from_pretrained('openai/clip-vit-base-patch32').to(self.device)
        self.clip_processor = CLIPProcessor.from_pretrained('openai/clip-vit-base-patch32')
        self.sbert = SentenceTransformer('all-MiniLM-L6-v2')
        self.clip_embeddings = None
        self.sbert_embeddings = None
        self.df = None
        print('✅ Models ready.')

    def load_data(self, df):
        """Load a pandas DataFrame with product data."""
        self.df = df.reset_index(drop=True)
        self.df['product_text'] = (
            self.df['baseColour'].fillna('') + ' ' +
            self.df['articleType'].fillna('') + ' - ' +
            self.df['productDisplayName'].fillna('')
        ).str.strip()

    def build_index(self):
        """Compute and cache all embeddings."""
        texts = self.df['product_text'].tolist()
        self.clip_embeddings = self._clip_embed(texts)
        self.sbert_embeddings = normalize(self.sbert.encode(texts, show_progress_bar=True))
        print(f'✅ Indexed {len(texts)} products.')

    def _clip_embed(self, texts, batch_size=64):
        all_embs = []
        for i in range(0, len(texts), batch_size):
            batch = texts[i:i+batch_size]
            inputs = self.clip_processor(
                text=batch, return_tensors='pt',
                padding=True, truncation=True, max_length=77
            ).to(self.device)
            with torch.no_grad():
                embs = self.clip_model.get_text_features(**inputs)
            all_embs.append(embs.cpu().numpy())
        return normalize(np.vstack(all_embs))

    # ── TASK 1: RECOMMENDATION ──────────────────────────────────────────────
    def recommend(self, product_name: str, top_k: int = 5):
        q_emb = self._clip_embed([product_name])
        match = self.df[self.df['productDisplayName'].str.contains(product_name, case=False, na=False)]
        own_cat = match.iloc[0]['subCategory'] if len(match) > 0 else 'Footwear'
        comp_cats = COMPLEMENTARY_MAP.get(own_cat, list(COMPLEMENTARY_MAP.keys()))
        cands = self.df[self.df['subCategory'].isin(comp_cats)].copy()
        if len(cands) == 0:
            cands = self.df.copy()
        sims = cosine_similarity(q_emb, self.clip_embeddings[cands.index])[0]
        cands['similarity'] = sims
        return cands.nlargest(top_k, 'similarity')[
            ['productDisplayName', 'masterCategory', 'subCategory', 'baseColour', 'similarity']
        ]

    # ── TASK 2: DEDUPLICATION ───────────────────────────────────────────────
    def deduplicate(self, product_list: list, threshold: float = 0.15):
        embs = normalize(self.sbert.encode(product_list))
        dist_matrix = cosine_distances(embs)
        labels = DBSCAN(eps=threshold, min_samples=1, metric='precomputed').fit_predict(dist_matrix)
        clusters = {}
        for idx, lbl in enumerate(labels):
            clusters.setdefault(lbl, []).append(idx)
        catalog, info = [], []
        for lbl, indices in clusters.items():
            canonical = product_list[min(indices, key=lambda i: len(product_list[i]))]
            members = [product_list[i] for i in indices]
            sim = cosine_similarity(embs[indices]).mean() if len(indices) > 1 else 1.0
            catalog.append(canonical)
            info.append({'canonical': canonical, 'members': members, 'avg_similarity': sim})
        return catalog, info, embs, labels

    # ── TASK 3: TEXT SEARCH ──────────────────────────────────────────────────
    def search(self, query: str, top_k: int = 6):
        q_emb = self._clip_embed([query])
        sims = cosine_similarity(q_emb, self.clip_embeddings)[0]
        results = self.df.copy()
        results['similarity'] = sims
        return results.nlargest(top_k, 'similarity')[
            ['productDisplayName', 'masterCategory', 'subCategory', 'baseColour', 'similarity']
        ]
