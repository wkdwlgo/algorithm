
    
def solution(arr):
    if(len(arr)==1):
        arr[0]=-1
        return arr
    min=arr[0]
    for i in range(1,len(arr)):
        if(min>arr[i]):
            min=arr[i]
    arr.remove(min)
    return arr
