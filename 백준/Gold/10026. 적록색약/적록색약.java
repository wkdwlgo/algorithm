 import java.io.*;
import java.util.*;
import java.text.*;
class location{
	int x;
	int y;
	location(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class Main {
	public static int N;
	public static int mx[]= {-1,1,0,0};
	public static int my[]= {0,0,-1,1};
	public static boolean visited[][];
	public static int arr[][];
	public static int no_Green=0;
	public static char medicine_Arr[][];
	public static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N= Integer.parseInt(br.readLine()); 
		arr=new int[N][N];
		visited=new boolean[N][N];
		medicine_Arr=new char[N][N];
		for(int i=0; i<N; i++)
		{
			String str=br.readLine();
			for(int j=0; j<str.length(); j++)
			{
				medicine_Arr[i][j]=str.charAt(j);
			}
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(visited[i][j]==false)
				{
					BFS(i, j);
				}
			}
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(visited[i][j]==true)
				{
					visited[i][j]=false;
				}
			}
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(visited[i][j]==false)
				{
					GR_BFS(i, j);
				}
			}
		}

		System.out.print((count)+" "+(no_Green));
		
	}
	public static void BFS(int x, int y)
	{
		Queue<location> que= new LinkedList<>();
		char present_Color=medicine_Arr[x][y];
		que.add(new location(x, y));
		arr[x][y]=count;
		visited[x][y]=true;
		while(!que.isEmpty())
		{
			location now=que.poll();
			for(int i=0; i<mx.length; i++)
			{
				int now_x=now.x+mx[i];
				int now_y=now.y+my[i];
				if(now_x>=0&&now_x<N&&now_y>=0&&now_y<N)
				{
					if(medicine_Arr[now_x][now_y]==present_Color&&visited[now_x][now_y]==false)
					{
						visited[now_x][now_y]=true;
						arr[now_x][now_y]=count;
						que.add(new location(now_x,now_y));
					}
				}
			}
		}
		count++;
	}
	public static void GR_BFS(int x, int y)
	{
		Queue<location> que= new LinkedList<>();
		char present_Color=medicine_Arr[x][y];
		que.add(new location(x, y));
		arr[x][y]=no_Green;
		visited[x][y]=true;
		while(!que.isEmpty())
		{
			location now=que.poll();
			for(int i=0; i<mx.length; i++)
			{
				int now_x=now.x+mx[i];
				int now_y=now.y+my[i];
				if(now_x>=0&&now_x<N&&now_y>=0&&now_y<N)
				{
					if(visited[now_x][now_y]==false)
					{
						if(present_Color=='B')
						{
						if(present_Color==medicine_Arr[now_x][now_y])
						{
						visited[now_x][now_y]=true;
						arr[now_x][now_y]=no_Green;
						que.add(new location(now_x,now_y));
						}
						}
						else 
						{
							if(medicine_Arr[now_x][now_y]=='R'||medicine_Arr[now_x][now_y]=='G')
							{
								visited[now_x][now_y]=true;
								arr[now_x][now_y]=no_Green;
								que.add(new location(now_x,now_y));
							}
						}
					}
				}
			}
		}
		no_Green++;
	}
}
