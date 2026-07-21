import os
print("Current working directory:", os.getcwd())

files = []
data = ""
path = input("Enter path: ")

if not os.path.exists(path):
    print(f"Directory {path} does not exist.")
else:
    print("Files in the directory:", os.listdir(path))

    while True:
        f_name = input("Enter your file name (without .txt extension): ")
        files.append(f_name)
        ans = input("Do you want to continue (y or n)? ")
        if ans.lower() != 'y':
            break

    for file in files:
        filename = os.path.join(path, file + ".txt")
        
        if os.path.exists(filename):
            with open(filename, "r") as f:
                data =data+f.read()  # Add file content to data
        else:
            print(f"File {filename} not found!")

    merged_filename = input("Enter name for merged file (without .txt extension): ") + ".txt"
    with open(merged_filename, "w") as f:
        f.write(data)

    print(f"Merged content has been written to {merged_filename}")
