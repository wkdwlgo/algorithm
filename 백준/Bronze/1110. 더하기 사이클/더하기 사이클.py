N = int(input())
count = 0
number=N
while(True):
    ten=number//10
    one=number%10
    middle=ten+one
    number=one*10+(middle%10)
    #print(number)
    count+=1
    if(number==N):
        break;
print(count)