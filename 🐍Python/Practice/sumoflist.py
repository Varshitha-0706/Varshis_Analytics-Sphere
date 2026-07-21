l=[1,2,3,4,5]
sum=0
for i in range(len(l)):
    sum+=l[i]
print("sum of all terms in list",sum)
for i in range(len(l)):
    if(l[i]>l[i-1]):
        g=l[i]
print("greatest number in list",g)
for i in range(len(l)):
    c=l[i]-l[i-1]
    print("difference between {},{} is".format(l[i],l[i-1]),c)
    print("difference b/w {0},{1} is".format(l[i],l[i-1]),c)
    print("difference b/w {first} ,{second} =".format(first=l[i],second=l[i-1]),c)
#Terms in list
for i in range(len(l)):
    t=l[i]
    print("%d"%t)
    print("%1.2f" %t)
a = 1 + 2 + 3 + \
4 + 5 + 6 + \
7 + 8 + 9
print(a)
a = 1+2j
print(a, "is complex number?", isinstance(a,complex))
print(1,2,3,4,sep='*',end='\n')#end default to new line
m="varshitha"
print("I am ",m)#default space b/w str and value
a=1;b=2;c=3
x=y=z=7
print(1,2,sep='$');print(3,4,sep='%')
L=[3, 6, 9, 12, 5, 3, 2]
print ("Original List --> ", L)
print ("L * 3 --> ", L * 3)
print ("L + L --> ", L +L )
L=[3, 6, 9, 12, 5, 3, 2]
print ("Original List --> ", L)
print ("max --> ", max(L))
print ("min --> ", min(L))
print ("Before Sort --> ", L)
L.sort()
print ("After Sort (Asending) --> ", L)
L.sort(reverse=True)
print ("After Sort (Desending) --> ", L)
L1 = [3, 6, 9]
L2 = [12, 5, 3, 2]
L3 = L1 + L2
print ("L1 --> ",L1)
print ("L2 --> ",L2)
print ("L1 + L2 = L3 --> ",L3)
print ("L3[2:] --> ",L3[2:])
print ("L3[2:5] --> ",L3[2:5])
print ("L3[:-1] --> ",L3[:-1])
print ("L3[::2] --> ",L3[::2])
# Multiply all elements in list
L = [12, 5, 3, 2, 7]
print ("Original List --> ", L)
newL = [ i * 5 for i in L ]
print ("After Multiply with constant --> ", newL)