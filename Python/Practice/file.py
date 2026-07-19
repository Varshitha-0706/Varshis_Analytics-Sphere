f=open("cake.jpg",'rb')
f1=open("imgcake.jpg",'wb')
for i in f:
    print(i)
for i in f:
    f1.write(i)
    