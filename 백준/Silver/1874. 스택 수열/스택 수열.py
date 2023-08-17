
import sys
input = sys.stdin.readline
n=int(input())
stack=[]
result=[]
cnt=1
for i in range(0,n):
    num=int(input())
    while cnt<=num:
        stack.append(cnt)
        result.append('+')
        cnt+=1
        
    if stack[-1]==num:
        stack.pop()
        result.append('-')
    else:
        break

            
if len(stack)!=0:
    print('NO')
else:
    for i in result:
        print(i)
    