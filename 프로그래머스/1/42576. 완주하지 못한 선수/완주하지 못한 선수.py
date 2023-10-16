def solution(participant, completion):
    answer = ''
    dic={}
    for name in participant:
        if name in dic:
            dic[name]+=1
        else:
            dic[name]=1
    for name in completion:
        dic[name]-=1
    for key,value in dic.items():
        if value!=0:
            answer=key
    return answer