import sys
from itertools import combinations
from collections import deque,Counter
n, m = map(int, sys.stdin.readline().split())
grid = [list(map(int, input().split())) for _ in range(n)]
dir_xy=[[-1,0],[1,0],[0,-1],[0,1]]

virus_xy, empty_xy=[],[]
max_Saftyzone=0
for i in range(n):
    for j in range(m):
        if grid[i][j]==2:
            virus_xy.append([i,j])
        if grid[i][j]==0:
            empty_xy.append([i,j])

def BFS(grid_temp):
    q=deque(virus_xy)
    while q:
        x, y = q.popleft()
        visited.add((x,y))
        for i,j in dir_xy:
            nxt_x=x+i
            nxt_y=y+j
            if 0<=nxt_x<n and 0<=nxt_y<m and (nxt_x,nxt_y) not in visited and grid_temp[nxt_x][nxt_y]==0:
                grid_temp[nxt_x][nxt_y]=2
                q.append((nxt_x,nxt_y))

            

for wall_xy in combinations(empty_xy,3):
    grid_temp = [grid[i][:] for i in range(n)] 
    visited = set()
    for wall in wall_xy:
        x,y=wall
        grid_temp[x][y]=1
    BFS(grid_temp)
    count = Counter([])
    for row in grid_temp:
        count += Counter(row)
    if max_Saftyzone<count[0]:
        max_Saftyzone=count[0]

print(max_Saftyzone)
