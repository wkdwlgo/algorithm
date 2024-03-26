import sys
from collections import deque

input = sys.stdin.readline
n, m ,fuel= map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
px,py= map(int, input().split())
px,py=px-1,py-1
passenger_dic={}
for i in range(m):
    fx, fy ,tx,ty= map(int, input().split())
    passenger_dic[fx-1,fy-1]=(tx-1,ty-1)
dir_xy = [[-1, 0], [1, 0], [0, -1], [0, 1]]  
def choose_passenger(tx,ty):
    answer_temp=[]
    answer=[]
    visited=set()
    q=deque()
    q.append([tx,ty,0])
    visited.add((tx,ty))
    min_distance=100000000000
    while q:
        x,y,distance=q.popleft()
        if (x,y) in passenger_dic:
            answer_temp.append([x,y,distance])
            min_distance=min(min_distance,distance)
        for i,j in dir_xy:
            nxt_x,nxt_y=x+i,y+j
            if 0<=nxt_x<n and 0<=nxt_y<n and grid[nxt_x][nxt_y]!=1 and (nxt_x,nxt_y) not in visited:
                q.append([nxt_x,nxt_y,distance+1])
                visited.add((nxt_x,nxt_y))
        
    for i in range(len(answer_temp)):
        x,y,distance=answer_temp[i][0],answer_temp[i][1],answer_temp[i][2]
        if min_distance==distance:
            answer.append([x,y,distance])
            #최단거리가 똑같으면
        if len(answer)>1:
                # 행번호가 가장 낮은 것으로 
            if x>answer[-2][0]:
                del answer[-1]
            elif x<answer[-2][0]:    
                del answer[-2]
                # 행번호도 같다면 
            else:
                    # 열번호가 가장 낮은 것으로 
                if y>answer[-2][1]:
                    del answer[-1]
                else: 
                    del answer[-2]

    return answer
   
def move(tx,ty):
    temp=[]
    visited=set()
    q=deque()
    q.append([tx,ty,0])
    visited.add((tx,ty))
    while q:
        x,y,distance=q.popleft()
        if (x,y)==passenger_dic[tx,ty]:
            temp.append([x,y,distance])
        for i,j in dir_xy:
            nxt_x,nxt_y=x+i,y+j
            if 0<=nxt_x<n and 0<=nxt_y<n and grid[nxt_x][nxt_y]==0 and (nxt_x,nxt_y) not in visited:
                q.append([nxt_x,nxt_y,distance+1])
                visited.add((nxt_x,nxt_y))
                  
    return temp
for i in range(m):
    passenger=choose_passenger(px,py)
    if len(passenger)>0:
        pre_fx,pre_fy,spend_fuel1=passenger[0]
    else: 
        fuel=-1
        break
    move_list=move(pre_fx,pre_fy)
    if len(move_list)>0:
        pre_tx,pre_ty,spend_fuel2=move_list[0]
    else:
        fuel=-1
        break
    if fuel-spend_fuel1-spend_fuel2>=0:
        fuel=fuel-spend_fuel1-spend_fuel2+(spend_fuel2*2)
        del passenger_dic[pre_fx,pre_fy]    
    else:
        fuel=-1
        break
    px,py=pre_tx,pre_ty
    
print(fuel)