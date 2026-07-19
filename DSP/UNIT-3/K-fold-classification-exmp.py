#!/usr/bin/env python
# coding: utf-8

# ### Implementing K-Fold Cross-Validation  in Python

# #### make_classification generates simulated datasets to test single stage DTR learning algorithms. 

# In[3]:


from sklearn.datasets import make_classification
import pandas as pd
X, y = make_classification(n_samples = 50,
                                       n_features = 5,
                                       n_informative = 5,
                                       n_redundant = 0,
                                       n_classes = 2,
                                       weights = [0.51, .49])


# In[11]:


print(y)


# In[6]:


### Splitting the Data into Folds


# In[7]:


import numpy as np
def kfold_indices(data, k):
    fold_size = len(data) // k
    indices = np.arange(len(data))
    folds = []
    for i in range(k):
        test_indices = indices[i * fold_size: (i + 1) * fold_size]
        train_indices = np.concatenate([indices[:i * fold_size], indices[(i + 1) * fold_size:]])
        folds.append((train_indices, test_indices))
    return folds

# Define the number of folds (K)
k = 5

# Get the fold indices
fold_indices = kfold_indices(X, k)


# In[9]:


fold_indices[0] #first fold values containing train and test indices


# #### Performing K-Fold Cross-Validation

# In[10]:


from sklearn.metrics import accuracy_score
from sklearn.linear_model import LogisticRegression  # Replace with your model of choice

# Initialize your machine learning model (e.g., Logistic Regression)
model = LogisticRegression()

# Initialize a list to store the evaluation scores
scores = []

# Iterate through each fold
for train_indices, test_indices in fold_indices:
    X_train, y_train = X[train_indices], y[train_indices]
    X_test, y_test = X[test_indices], y[test_indices]
    
    # Train the model on the training data
    model.fit(X_train, y_train)
    
    # Make predictions on the test data
    y_pred = model.predict(X_test)
    
    # Calculate the accuracy score for this fold
    fold_score = accuracy_score(y_test, y_pred)
    
    # Append the fold score to the list of scores
    scores.append(fold_score)

# Calculate the mean accuracy across all folds
mean_accuracy = np.mean(scores)
print("K-Fold Cross-Validation Scores:", scores)
print("Mean Accuracy:", mean_accuracy)


# #### K-Fold Cross Validation in Python (Linear Regression)

# In[1]:


#Load Necessary Libraries
from sklearn.model_selection import train_test_split
from sklearn.model_selection import KFold
from sklearn.model_selection import cross_val_score
from sklearn.linear_model import LinearRegression
from numpy import mean
from numpy import absolute
from numpy import sqrt
import pandas as pd


# In[3]:


#Step 2: Create the Data
#Next, we’ll create a pandas DataFrame that contains two predictor variables, x1 and x2, and a single response variable y.


# In[6]:


df = pd.DataFrame({'y': [6, 8, 12, 14, 14, 15, 17, 22, 24, 23],
                   'x1': [2, 5, 4, 3, 4, 6, 7, 5, 8, 9],
                   'x2': [14, 12, 12, 13, 7, 8, 7, 4, 6, 5]})


# In[ ]:


#Step 3: Perform K-Fold Cross-Validation
#Next, we’ll then fit a multiple linear regression model to the dataset and perform LOOCV to evaluate the model performance.


# In[7]:


#define predictor and response variables
X = df[['x1', 'x2']]
y = df['y']

#define cross-validation method to use
cv = KFold(n_splits=10, random_state=1, shuffle=True)

#build multiple linear regression model
model = LinearRegression()

#use k-fold CV to evaluate model
scores = cross_val_score(model, X, y, scoring='neg_mean_absolute_error',
                         cv=cv, n_jobs=-1)

#view mean absolute error
mean(absolute(scores))


# From the output we can see that the mean absolute error (MAE) was 3.614. That is, the average absolute error between the model prediction and the actual observed data is 3.614.
# 
# In general, the lower the MAE, the more closely a model is able to predict the actual observations.

# In[8]:


#define cross-validation method to use
cv = KFold(n_splits=5, random_state=1, shuffle=True) 

#build multiple linear regression model
model = LinearRegression()

#use LOOCV to evaluate model
scores = cross_val_score(model, X, y, scoring='neg_mean_squared_error',
                         cv=cv, n_jobs=-1)

#view RMSE
sqrt(mean(absolute(scores)))



# The lower the RMSE, the more closely a model is able to predict the actual observations.
# 
# In practice we typically fit several different models and compare the RMSE or MAE of each model to decide which model produces the lowest test error rates and is therefore the best model to use.

# In[ ]:


import pandas as pd 
X = pd.DataFrame(data.data, columns=data.feature_names) 
y = data.target


# In[ ]:





# In[ ]:




