def solution(n):
    temp = []
    answer=''
    for i in str(n):
        temp.append(int(i))
    temp.sort(reverse=True)
    for i in temp:
        answer+=str(i)  
    return int(answer)