import java.io.*;
import java.util.*;
import java.text.*;
class Island
{
	int x;
	int y;
	 Island(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class Main{
 public static int mx[]= {-1,1,0,0,-1,-1,1,1};
 public static int my[]= {0,0,-1,1,1,-1,1,-1};
 public static int w=1;
 public static int h=1;
 public static int arr[][];
 public static boolean visited[][];
 public static int count=0;
 //public static LinkedList<Integer> list =new LinkedList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true)
		{
			count=0;
			StringTokenizer st=new StringTokenizer(br.readLine()); 
			w= Integer.parseInt(st.nextToken());
			h= Integer.parseInt(st.nextToken()); 
			if(w==0&&h==0)
			{
				break;
			}
			arr= new int [h][w];
			visited=new boolean [h][w];
			for(int i=0; i<h; i++)
			{
				st=new StringTokenizer(br.readLine()); 
				for(int j=0; j<w; j++)
				{
					arr[i][j]=Integer.parseInt(st.nextToken()); 
				}
			}
			if(w==1&&h==1)
			{
				sb.append(arr[0][0]).append("\n");
			}
			else 
			{
				for(int i=0; i<h; i++)
				{
					
					for(int j=0; j<w; j++)
					{
						if(visited[i][j]==false&&arr[i][j]==1)
						{
							BFS(i,j);
						}
					}
				}
				sb.append(count).append("\n");
			}
		}
		System.out.println(sb);
	}
	public static void BFS(int x, int y)
	{
		Queue<Island> que=new LinkedList<>();
		que.add(new Island(x,y));
		while(!que.isEmpty())
		{
			Island cur=que.poll();
			for(int i=0; i<mx.length; i++)
			{
				int now_x=cur.x+mx[i];
				int now_y=cur.y+my[i];
				if(now_x>=0&&now_x<h&&now_y>=0&&now_y<w)
				{
					if(visited[now_x][now_y]==false&&arr[now_x][now_y]==1)
					{
						visited[now_x][now_y]=true;
						que.add(new Island(now_x,now_y));
					}
				}
			}
		}
		que.clear();
		count++;
	}
}
