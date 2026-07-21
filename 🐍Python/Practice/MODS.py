import os 
cwd = os.getcwd() 
print("Current working directory:", cwd)
import os 
def current_path(): 
    print("Current working directory before") 
    print(os.getcwd()) 
    print() 
current_path() 
os.chdir('../') 
current_path()
import array
arr = array.array('i', [1, 2, 3, 1, 5])

# using remove() method to remove first occurance of 1
arr.remove(1)

print(arr)

# pop() method - remove item at index 2
arr.pop(2)
print(arr)
import array as arr 
a = arr.array('i', [1, 2, 3,4,5])

# using extend() method
a.extend([6,7,8,9,10])
print(a)
print(len(a))