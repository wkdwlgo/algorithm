def solution(clothes):
    answer = 1
    dic={}
    for name, clothe in clothes:
        dic[clothe]=dic.get(clothe, 0) + 1
    for key in dic:
        answer*=(dic[key]+1)
    answer-=1
    return answer