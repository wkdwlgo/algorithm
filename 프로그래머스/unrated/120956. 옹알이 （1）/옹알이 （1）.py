def solution(babbling):
    answer = 0
    pro=["aya", "ye", "woo", "ma"]
    for i in babbling:
        count=0
        for j in pro:
            if j in i:
                count+=len(j)
        if count==len(i):
            answer+=1
    return answer