import pandas as pd
scores = [45, 55, 60, 62, 65, 70, 72, 74, 80, 85, 90, 92, 95, 98]
df=pd.qcut(scores,q=4)
print(df)