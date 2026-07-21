def arraytodictionary(keys,values):
    dict={}
    if len(keys)!=len(values):
        max_len=max(len(keys),len(values))
        keys+=[None]*(max_len-len(keys))
        values+=[None]*(max_len-len(values))
    for i in range(len(keys)):
        dict[keys[i]]=values[i]
    return dict
        
keys=['a','b','c'] #No duplicates
values=[1]
d=arraytodictionary(keys,values)
print(d)
k=['x','y','y']   # Duplicates
v=[1,2]
d=arraytodictionary(k,v)
print(d)