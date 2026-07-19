l=[10,20,30,40,50]
l.remove(10)
print(l)
l.insert(4,60)
print(l[4])
l.append(70)
print(l)
l.pop()
print("popped",l)
l.clear()
print(l)
del l
t=(1,2,3,4,5)
print(t)
print(t[1:])
print(t[:5])
print("Reversing:",t[::-1])   #reversing
print(t[1:3])
print("max-",max(t))
print("min-",min(t))
print("sum-",sum(t))
print("len-",len(t))
s1={1,2,3,4,5}
print(s1)
s={}
print(s)
s2={5,6,7}
s3=s1.union(s2)
print(s3)
s4=s1.intersection(s2)
print(s4)
s1.add(8)
print(s1)
s1.remove(2)
print(s1)
s1.pop()
s5={1,2,0,False,True,4,4} #True=1,False=0 any one is taken no duplicates allowed..
print("s5=",s5)
print("popped",s1)
del s2
dict={1:"varshi",2:"devika",3:"moulika",4:"renusri",5:"deepu"}
print(dict)
print("keys")
for k in dict: #keys
    print(k)
print("values:")
for k in dict:
    print(dict[k])
print("values=")
for k in dict.values():
    print(k)
for k in dict.items():
    print(k)

    