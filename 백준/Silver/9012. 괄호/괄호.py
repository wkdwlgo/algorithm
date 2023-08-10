n = int(input())
result = []

for i in range(n):
    괄호 = input()
    stack = []

    for j in 괄호:
        if not stack or j == "(":
            stack.append(j)
        elif stack[-1] == "(" and j == ")":
            stack.pop()
        else:
            stack.append(j)

    if not stack:
        result.append('YES')
    else:
        result.append('NO')

for r in result:
    print(r)
