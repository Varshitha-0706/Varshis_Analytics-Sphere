scores=[]
n=int(input("Enter no.of subjects:"))
for i in range(n):
  score=float(input(f"Enter score for subject{i+1}:"))
  scores.append(score)
  #Sort(scores) same list modified
sorted_scores=sorted(scores)
#New list created
print(sorted_scores)
