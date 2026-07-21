class Student: 
    def __init__(self, name, id, age):
        self.name = name
        self.id = id
        self.age = age
    def display_details(self):
        print("Name:%s, ID:%d, age:%d"%(self.name,self.id))

# creates the object of the class Student
s = Student("John", 101, 22)
print(getattr(s, 'name'))
# reset the value of attr
setattr(s, "age", 23)
print(getattr(s, 'age'))

# prints true if the student contains the attribute
print(hasattr(s,"age"))
print(s.age)
delattr(s,"age")
#print(s.age)  #error since it is deleted
#    BUILT-IN ATTRIBUTES...

print(s.__doc__)  #String which has class documentation
print(s.__dict__) #Dictionry having info 
print(s.__module__) #Module in which class is defined..
# DEFAULT ARGUMENTS FUNCTION
def temp(value,unit='C'):
    if unit=='C':
        return(value-32)*5/9
    elif unit=='F':
        return(value*9/5)+32
    else:
        return("Invalid unit")
print(temp(87))
print(temp(876,'F'))
print(temp.__defaults__)
# VARIABLE LENGTH ARGUMENTS
def sum(*args):
    print(args)
sum(2,4,3,5,4)
