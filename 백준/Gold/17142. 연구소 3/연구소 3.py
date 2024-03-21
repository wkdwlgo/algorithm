from itertools import combinations
from collections import deque
import sys

input = sys.stdin.readline
n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
dir_xy = [[-1, 0], [1, 0], [0, -1], [0, 1]]
virus_xy = []
answer = 1000000

for r in range(n):
    for c in range(n):
        if grid[r][c] == 0:
            grid[r][c] = '@'
        elif grid[r][c] == 1:
            grid[r][c] = '-'
        elif grid[r][c] == 2:
            virus_xy.append([r, c])
            grid[r][c] = '*'

def bfs(v):
    global answer
    q = deque()
    for r, c in v:
        q.append([r, c, 0])
    grid_temp = [grid[i][:] for i in range(n)]
    max_second = 0
    while q:
        x, y, second = q.popleft()
        for i, j in dir_xy:
            nxt_x, nxt_y, nxt_second = x + i, y + j, second + 1
            if 0 <= nxt_x < n and 0 <= nxt_y < n:
                if grid_temp[nxt_x][nxt_y] == '@':
                    grid_temp[nxt_x][nxt_y] = nxt_second
                    max_second = max(max_second, nxt_second)
                    q.append([nxt_x, nxt_y, nxt_second])
                elif grid_temp[nxt_x][nxt_y] == '*':
                    grid_temp[nxt_x][nxt_y] = nxt_second
                    q.append([nxt_x, nxt_y, nxt_second])
            
    grid_temp_1d = [cell for row in grid_temp for cell in row]
    if '@' not in grid_temp_1d:
        answer = min(answer, max_second)
        
for virus in combinations(virus_xy, m):
    for x, y in virus:
        grid[x][y] = 0
    bfs(virus)
    for x, y in virus:
        grid[x][y] = '*'

if answer == 1000000:
    answer = -1

print(answer)
