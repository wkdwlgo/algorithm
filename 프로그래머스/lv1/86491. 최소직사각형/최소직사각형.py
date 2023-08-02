def solution(sizes):
    answer = 0
    max_x=0
    max_y=0
    for i in sizes:
        i.sort(reverse=True)
        if max_x<i[0]:
            max_x=i[0]
        if max_y<i[1]:
            max_y=i[1]
    answer=max_x*max_y
    return answer