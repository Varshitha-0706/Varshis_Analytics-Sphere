#ALL modules list
#help('modules')

#DATETIME MODULE
import datetime
x=datetime.datetime.now()
print(x)
print(x.strftime("%A"))
print(x.year)
print(x.strftime("%a"))
print(x.strftime("%B"))
print(x.strftime("%b"))
print(x.strftime('%%'))
print(x.strftime('%W'))
print(x.strftime('%j'))
y=datetime.datetime(2024,5,12)
print(y)
z=datetime.datetime(2024,11,7,13,2,43,232)
print(z)
p=datetime.datetime(2025,12,8,12,2,13)
print(p)
print(x.strftime('%c'))
print(x.strftime('%x'))
#JSON MODULE
import json
#JSON=javascript object notation to work with json data,for storing and exchanging data..
#JSON TO PYTHON==Python DICTIONARY
x='{"name":"varshi","class":4,"branch":"cse"}'
print(json.loads(x))
#Python to JSON
#  1) Dict-->object
y={"name":"varshi","class":4,"branch":"cse"}
print(json.dumps(y))
#  2)int,float-->number
c=20
print(json.dumps(c))
#  3)True->ture,False-->false
b=True
print(json.dumps(b))
#  4)None-->null
n=None
print(json.dumps(n))
#  5)list-->Array
l=[1,23,46,8,9,0]
print(json.dumps(l))
#  6)tuple-->Array
t=(1,2,4,23,76,89,90)
print(json.dumps(t))
# json.dumps(x,indent=4,separators=(".","="),sort_keys=True)
# separator: .-->b/w objects and =-->separate keys from values

# RANDOM MODULE
import random
print(random.randint(0,5))
print(random.random())
print(random.random()*90)
print(random.randint(1,100))
l=[1,2.4,5,6,9]
print(random.choice(l))
print(random.seed(5))
random.seed(5) #Consistency by using seed() ,value doesn't change
print(random.random())
