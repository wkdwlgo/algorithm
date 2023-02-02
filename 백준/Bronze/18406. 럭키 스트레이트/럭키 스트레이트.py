# Q5 Answer Template
left_sum=0
right_sum=0
n = input()

for i in range(0, len(n)//2):
    left_sum+=int(n[i])
   # print(left_sum)
for i in range(len(n)//2, len(n)):
    right_sum+=int(n[i])
    #print(right_sum)

if(left_sum==right_sum):
    print("LUCKY")
else:
    print("READY")