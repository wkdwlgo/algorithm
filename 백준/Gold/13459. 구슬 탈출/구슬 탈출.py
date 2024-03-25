from collections import deque
import sys

input = sys.stdin.readline

n, m = map(int,input().split())
board = [input().rstrip() for _ in range(n)]


answer = 0
queue = deque()
visited = set()

for r in range(n):
    for c in range(m):
        if board[r][c] == "R":
            rr, rc = r, c
        elif board[r][c] == "B":
            br, bc = r, c
            
queue.append([rr, rc, br, bc, 1])
visited.add((rr, rc, br, bc))


def move(r, c, dr, dc):
    count = 0
    while board[r+dr][c+dc] != "#" and board[r][c] != "O":
        r += dr
        c += dc
        count += 1
    return r, c, count

while queue:
    cur_rr, cur_rc, cur_br, cur_bc, level = queue.popleft()

    if level > 10:
        break
    for dr, dc in [[-1,0],[1,0],[0,-1],[0,1]]:
	
        next_rr, next_rc, r_count = move(cur_rr, cur_rc, dr, dc)
        next_br, next_bc, b_count = move(cur_br, cur_bc, dr, dc)

        if (next_rr, next_rc, next_br, next_bc) in visited:
            continue

        if board[next_br][next_bc] == 'O':
            continue

        if board[next_rr][next_rc] == 'O':
            answer = 1
            break
				
        if next_rr == next_br and next_rc == next_bc:
            if r_count > b_count:
                next_rr -= dr
                next_rc -= dc
            else:
                next_br -= dr
                next_bc -= dc
        queue.append([next_rr, next_rc, next_br, next_bc, level+1])
				
        visited.add((next_rr, next_rc, next_br, next_bc))
    else:
        continue
    break

print(answer)