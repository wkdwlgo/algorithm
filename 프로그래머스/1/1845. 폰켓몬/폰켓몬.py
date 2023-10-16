def solution(nums):
    answer = len(nums)//2
    temp=0
    dic=[]
    for i, pocketmon in enumerate(nums):
            dic.append(list(set(nums[i+1:])))
    
    for val in dic:
        if temp<len(val):
            temp=len(val)
    if answer> temp:
        return temp
    else:
        return answer