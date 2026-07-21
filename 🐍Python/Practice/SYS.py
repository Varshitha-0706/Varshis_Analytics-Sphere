# MODULE PATH
import sys
print("PATH=",sys.path)
print("version=",(sys.version))
for line in sys.stdin:
    if 'e'==line.rstrip():
        break
    print(f"Input:{line}")
print('Exit')
sys.stdout.write("varshi")
def print_to_stderr(*a):
    print(*a,file=sys.stderr)
print_to_stderr("hello world")
n=len(sys.argv)
print("\nTotal arguments passed:",n)
print('\nName of script ',sys.argv[0])
for i in range(1,n):
    print(sys.argv[i],end=" ")
sum=0
for i in range(1,n):
    sum+=int(sys.argv[i])
print("\n\nResult:",sum)