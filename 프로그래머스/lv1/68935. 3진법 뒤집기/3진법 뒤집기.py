def solution(n):
    answer = 0
    jinsu=3
    temp=''
    while n>=jinsu:
        temp+=str(n%3)
        n//=3
    temp+=str(n)
    baesu=0
    for i in range(len(temp)-1,-1,-1):
        answer+=(jinsu**baesu)*int(temp[i])
        baesu+=1
    return answer
        
    