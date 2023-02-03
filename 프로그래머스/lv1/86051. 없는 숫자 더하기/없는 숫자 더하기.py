def solution(numbers):
    answer = 0
    a=[0,1,2,3,4,5,6,7,8,9]
    for i in range(0,len(numbers)):
        for j in range(0, len(a)):
            if(numbers[i]==a[j]):
                   a[j]=0
    for i in range(0, len(a)):
        answer+=a[i]
    return answer
    