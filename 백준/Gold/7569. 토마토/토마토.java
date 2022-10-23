import java.io.*;
import java.util.*;
import java.text.*;
class Node{
	int z;
	int y;
	int x; 
	 Node(int z, int y, int x)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
}
public class Main {
	public static int arr[][][];
	//public static int count[][][];
	public static int m;
	public static int n;
	public static int h;
	public static int mx[]= {-1,0,1,0,0,0};//상하좌우위아래
	public static int my[]= {0,1,0,-1,0,0};
	public static int mz[]= {0,0,0,0,1,-1};
	public static Queue<Node> que;//클래스 형태로 큐 입력
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		m= Integer.parseInt(st.nextToken());
		n= Integer.parseInt(st.nextToken());
		h= Integer.parseInt(st.nextToken());
		arr=new int [h][n][m];
		que= new LinkedList<Node>();
		for(int i=0; i<h; i++)
		{
			for(int j=0; j<n; j++)
			{
				st=new StringTokenizer(br.readLine()); 
				for(int k=0; k<m; k++)
				{
					
					arr[i][j][k]=Integer.parseInt(st.nextToken());
				
					 if(arr[i][j][k]==1)
					{
						que.offer(new Node(i,j,k));
					}
				}
			}
		}
	
			System.out.println(BFS());
			
	
	}
	public static int BFS()//클래스 큐 사용(설명) https://st-lab.tistory.com/153
	{
		while(!que.isEmpty())	
		{
			Node now=que.poll();
			int z=now.z;
			int y=now.y;
			int x=now.x;
		for(int i=0; i<mx.length; i++)
		{
			int now_z=z+mz[i];
			int now_y=y+my[i];
			int now_x=x+mx[i];
			if(now_z>=0&&now_z<h&&now_y>=0&&now_y<n&&now_x>=0&&now_x<m)
			{
				if(arr[now_z][now_y][now_x]==0)
				{
					arr[now_z][now_y][now_x]=arr[z][y][x]+1;
					que.offer(new Node(now_z,now_y,now_x));
				}
			}
		}		
		}
		int max=0;
		for(int i=0; i<h; i++)
		{
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<m; k++)
				{
					if(arr[i][j][k]==0)
					{
						return -1;
					}
					else if(arr[i][j][k]>max)
					{
						max=arr[i][j][k];
					}
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
