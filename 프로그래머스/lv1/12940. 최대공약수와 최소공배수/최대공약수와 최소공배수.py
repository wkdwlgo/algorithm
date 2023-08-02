def solution(n, m):
    answer = []
    for i in range (max(n,m),0,-1):
        if n%i==0 and m%i==0:
            answer.append(i)
            answer.append(i*(n//i)*(m//i))
            break
    return answer