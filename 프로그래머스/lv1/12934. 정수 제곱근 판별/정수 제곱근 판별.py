def solution(n):
    answer = 0
    result=0
    if(n==1):
        return 4;
    for i in range (1,n//2):
        #print(i*i)
        if(n==i*i):
            answer=(i+1)*(i+1)
            result=1
            break
        else:
            continue
    if(result==0):
        answer=-1
    return answer