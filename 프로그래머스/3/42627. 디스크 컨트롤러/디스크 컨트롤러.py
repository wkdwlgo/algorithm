from heapq import heapify, heappush, heappop
def solution(jobs):
    answer = 0
    jobs_time_sum=0
    jobs.sort()
    q=[]
    visited=[False] * len(jobs)
    heappush(q,(jobs[0][1],jobs[0][0]))
    visited[0]=True
    cur_time=jobs[0][0]
    
    while q:
        push=False
        cur_taken_time,start_time=heappop(q)
        jobs_time_sum+=cur_time+cur_taken_time-start_time
        cur_time+=cur_taken_time
        for i,v in enumerate(jobs):
            if v[0]<=cur_time and not visited[i]:
                heappush(q,(v[1],v[0]))
                visited[i]=True
        
        if not q and not all(visited):
            cur_i=0    
            for i,v in enumerate(visited):
                if not v and cur_i<i:
                    cur_i=i
                    break
            heappush(q,(jobs[cur_i][1],jobs[cur_i][0]))
            visited[cur_i]=True
            cur_time=jobs[cur_i][0]
        

    answer=jobs_time_sum//len(jobs)
    return answer