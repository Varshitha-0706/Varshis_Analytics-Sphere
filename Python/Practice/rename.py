import os
path=input("Enter path:")
path.replace("\\","/")
end=path[-1]
if end!="/":
    path=path+"/"
print(os.listdir(path))
i=1
for file in os.listdir(path):
    new_name=path+"car"+str(i)+".txt"
    old_name=path+file
    os.replace(old_name,new_name)
    i=i+1
print(os.listdir(path))