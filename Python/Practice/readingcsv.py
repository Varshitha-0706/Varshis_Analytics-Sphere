import csv
import os
data = [
    ["Name", "Age", "Country"],
    ["John", 25, "USA"],
    ["Sarah", 30, "Canada"],
    ["Mark", 22, "UK"]
]

def detect_delimiter(file_path):
    with open(file_path, 'r') as file:
        sample = file.read(1024)  # Read first 1024 bytes to sample the data
        sniffer = csv.Sniffer()
        delimiter = sniffer.sniff(sample).delimiter
    return delimiter

with open('mydata.csv', mode='w', newline='') as file:
    writer = csv.writer(file)
    writer.writerows(data)
    print("Written data successfully")
while True:
    f=input("Enter file name(csv) you want to read data:")
    end=f[-4:]
    #To chech whether file name ends eith .csv or not?
    # if not f.endswith(".csv"):
    #     f += ".csv
    if end==".csv":
        print("okay")
    else:
        f=f+".csv"
    if os.path.exists(f):
            with open(f,"r") as fi: 
                d=detect_delimiter(f)
                if d=="|":
                    print("WITH OUT REGISTER_DIALECT")
                    data=csv.reader(fi)  
                    for re in data:
                        print(re) 
                    fi.seek(0)
                    print("USING REGISTER_DIALECT")
                    csv.register_dialect('normal_dialect',delimiter="|",quotechar='"')   
                    data=csv.reader(fi,dialect='normal_dialect')  
                    for re in data:
                        print(re) 
                else:
                     text=csv.reader(fi)
                     print(text)
                     header=next(text)
                     print(header)
                     no_of_cols=len(header)
                     print(f"No.of Coloums={no_of_cols}")
                     print("LIST FORMAT")
                     print("-"*20)
                     for rec in text:
                        print(rec)
                     fi.seek(0)
                     print("DICT FORMAT")
                     print("-"*20)
                     t=csv.DictReader(fi)
                     print(t)
                     for r in t:
                      print(r)
                                      
    else:
        print(f"{f} not found")
    ans = input("Do you want to continue (y or n)? ")
    if ans.lower() != 'y':
        break
