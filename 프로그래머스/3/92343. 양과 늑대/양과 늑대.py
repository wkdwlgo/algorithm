def solution(info, edges):
    global answer
    answer=0
    visited=[False for _ in range(len(info))]
    
    def dfs(s_count, w_count):
        global answer
        if w_count>=s_count:
            return
        if answer<s_count:
            answer=s_count
            
        for i,j in edges:
            if visited[i] and not visited[j]:
                visited[j]=True
                if info[j]==0:
                    dfs(s_count+1,w_count)
                else:
                    dfs(s_count,w_count+1)
                visited[j]=False
                
    visited[0]=True
    dfs(1,0)
    return answer