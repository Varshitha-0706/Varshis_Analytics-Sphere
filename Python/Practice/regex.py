import re
st="Hello Computer Science Organisation"
match=re.search(r"Science",st)
print(match)
print("Start Index:",match.start())
print("End Index:",match.end())
s="my number is 12345673 and 2345679"
regex='\d+'
m=re.findall(regex,s)
print(m)
p=re.compile('ab+')
print(p.findall("ababaaabbaa"))
p1=re.compile('[a-e]')
print(p1.findall("Aye,said mr.Gibenson stark"))
from re import split 
words=['Words','words','Words']
print(split('\W+','Words,words,Words'))

print(re.sub('ub','&','Subject has Uber booked already',flags=re.IGNORECASE))
print(re.sub('ub','&','Subject has Uber booked already'))
print(re.sub('ub','~*','Subject has Uber booked already',count=1,flags=re.IGNORECASE))
p2=re.compile("varshit..")
print(p2.findall("hello varshitha"))
reg="he..o"
print(re.findall(reg,"hello harinadh"))
str="hi my name is 25 3 7 varshitha"
p3=re.compile("h.?")
print(p3.findall(str))
p4=re.compile("v.*a")
print(p4.findall(str))
p5=re.compile("var.{5}a")
print(p5.findall(str))
p6=re.compile("is|in")
print(p6.findall(str))
p7=re.compile("[^abc]") #except abc
print("abc:",p7.findall(str))
p8=re.compile("[0-9]")
print(p8.findall(str))
p9=re.compile("\d")
print(p9.findall(str))
p10=re.compile("\d+")
print(p10.findall(str))
p11=re.compile("24|25")
print(p11.findall(str))
p12=re.compile("[a-zA-Z]")
print(p12.findall(str))

string="Computer Science and Engineering 21"
pt=re.compile("\ACom")
print(pt.findall(string))
pt1=re.compile(r"\bCom")
print(pt1.findall(string))
pt2=re.compile("\d")
print(pt2.findall(string))
pt3=re.compile("\s")
print(pt3.findall(string))
pt4=re.compile("\S")
print("S:",pt4.findall(string))
pt2=re.compile("\W")
print("W",pt2.findall(string))
pt3=re.compile("\w")
print("w",pt3.findall(string))
pt4=re.compile("hg\Z")
print(pt4.findall(string))
pt5=re.compile(" 21\Z")
print(pt5.findall(string))
#EMAIL ADDRESS
email="molabantivarshitha@gmail.com"
valid=re.match(r'^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$',email)
print("Valid email address." if valid else
      "Invalid email Address.")
