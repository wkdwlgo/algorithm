def solution(array, commands):
    answer = []
    for command in commands:
        temp=array[command[0]-1:command[1]]
        print(type(temp[0]))
        temp.sort()
        answer.append(temp[command[2]-1])
    return answer
