def solution(arr):
    answer = []
    before=arr[0]
    answer.append(arr[0])
    for i in range(0,len(arr)):
        if(before!=arr[i]):
            answer.append(arr[i])
            before=arr[i]
        else:
            continue
    return answer