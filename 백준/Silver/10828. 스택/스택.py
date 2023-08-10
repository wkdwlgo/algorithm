import sys
input = sys.stdin.readline
n= int(input())
stack=[]
for i in range(0,n):
    cmd=input()
    if 'push' in cmd:
        cmd=cmd.split(' ')
        number = int(' '.join(cmd[1:]))
        stack.append(number)
    elif 'pop' in cmd:
        if not stack:
            print(-1)
        else:
            print(stack[-1])
            stack.pop()
    elif 'size' in cmd:
        print(len(stack))
    elif 'empty' in cmd:
        if not stack:
            print(1)
        else:
            print(0)
    elif 'top' in cmd:
        if not stack:
            print(-1)
        else:
            print(stack[-1])