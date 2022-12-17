import java.io.*;
import java.util.*;
import java.lang.*;
class position
{
    int x;
    int y;
    position(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public static int mx[]={-1,1,0,0};
    public static int my[]={0,0,-1,1};
    public int solution(int[][] maps) {
        int visited[][]= new int[maps.length][maps[0].length];
        int answer = -1;
        BFS(maps,visited);
        if(visited[maps.length-1][maps[0].length-1]!=0)
        {
            answer=visited[maps.length-1][maps[0].length-1];
        }
        return answer;
    }
    public static void BFS(int[][] maps, int visited[][])
    {
        Queue <position> que= new LinkedList<>();
        que.add(new position(0,0));
        visited[0][0]=1;
        while(!que.isEmpty())
        {
            position cur=que.poll();
            for(int i=0; i<mx.length; i++)
            {
                int now_x=cur.x+mx[i];
                int now_y=cur.y+my[i];
                if(now_x>=0&&now_x<maps.length&&now_y>=0&&now_y<maps[0].length&&visited[now_x][now_y]==0&&maps[now_x][now_y]==1)
                {
                    que.add(new position(now_x,now_y));
                    visited[now_x][now_y]=visited[cur.x][cur.y]+1;
                }
            }
        }
    }
}