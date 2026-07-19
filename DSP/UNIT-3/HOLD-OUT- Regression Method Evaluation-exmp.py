#!/usr/bin/env python
# coding: utf-8

# ### HOLD-OUT- Regression Method Evaluation 

# In[1]:


# importing the libraries
from sklearn.linear_model import LinearRegressionw
from sklearn.metrics import mean_absolute_error,\
    mean_squared_error, mean_absolute_percentage_error


# #### Let’s load the data into the panda’s data frame and then split it into training and testing parts (for model evaluation) in the 80:20 ratio.

# In[6]:


import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
import seaborn as sns
import matplotlib.pyplot as plt
df = pd.read_csv('weather.csv')
X = df.iloc[:, 2].values
Y = df.iloc[:, 3].values
X_train, X_test,\
    Y_train, Y_test = train_test_split(X, Y,
                                       test_size=0.20,
                                       random_state=0)


# #### let’s train a simple linear regression model. On the training data and we will move to the evaluation part of the model using different metrics.

# In[8]:


X_train = X_train.reshape(-1, 1)
X_test = X_test.reshape(-1, 1)
regression = LinearRegression()
regression.fit(X_train, Y_train)
Y_pred = regression.predict(X_test)


# #### MAE=N∑i=1N​∣ypred–yactual∣ N

# In[9]:


mae = mean_absolute_error(y_true=Y_test,
                          y_pred=Y_pred)
print("Mean Absolute Error", mae)


# #### MSE=N∑i=1N​(ypred​–yactual​)2​

# In[11]:


mse = mean_squared_error(y_true=Y_test,
                         y_pred=Y_pred)
print("Mean Square Error", mse)


# #### RMSE=N∑i=1N​(ypred​–yactual​)2 / N

# In[12]:


rmse = mean_squared_error(y_true=Y_test,
                          y_pred=Y_pred,
                          squared=False)
print("Root Mean Square Error", rmse)


# In[ ]:




