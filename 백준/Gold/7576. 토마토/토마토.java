
import java.io.*;
import java.util.*;
import java.text.*;
class Root{
	int x;
	int y;
	 Root(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class Main {
	public static int arr[][];
	public static int mx[]= {1,-1,0,0};
	public static int my[]= {0,0,-1,1};
	public static Queue<Root> que;
	public static int m;
	public static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		m= Integer.parseInt(st.nextToken());//열
		n= Integer.parseInt(st.nextToken());//행
		arr=new int [n][m];
		que= new LinkedList<Root>();
		for(int i=0; i<n; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			for(int j=0; j<m; j++)
			{
				 
				 arr[i][j]=Integer.parseInt(st.nextToken());
				 if(arr[i][j]==1)
				 {
					 que.offer(new Root(i,j));
				 }
			}
		}	
		System.out.println(BFS());
	}
	public static int BFS()
	{
		while(!que.isEmpty())
		{
			Root rm=que.poll();
			int x=rm.x;
			int y=rm.y;
			for(int i=0; i<mx.length; i++)
			{
				int now_x=x+mx[i];
				int now_y=y+my[i];
				if(now_x>=0&&now_x<n&&now_y>=0&&now_y<m)
				{
					if(arr[now_x][now_y]==0)
					{
						arr[now_x][now_y]=arr[x][y]+1;
						que.offer(new Root(now_x, now_y));
					}
				}
			}
		}
		int max=0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				 if(arr[i][j]==0)
				 {
					 return -1;
				 }
				 else if(arr[i][j]>max)
				 {
					 max=arr[i][j];
				 }
			}
		}	
		if(max==1)
		{
			return 0;
		}
		
			return max-1;
		
	}
}
