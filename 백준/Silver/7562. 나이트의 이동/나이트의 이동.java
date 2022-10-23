import java.io.*;
import java.util.*;
import java.text.*;
class xy{ 
	int x;
	int y;
	int cnt;
	xy(int x, int y,int cnt){
		this.x=x;
		this.y=y;
		this.cnt=cnt;
	}
}
public class Main {
	public static int mx[]= {-1,-2,-2,-1,1,2,2,1};
	public static int my[]= {-2,-1,1,2,2,1,-1,-2};
	//public static int count=0;
	//public static boolean visited[][];
	//public static int arr[][];
	public static int arr_size;
	public static Queue<xy> que;
	//public static ArrayList<Integer> A=new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		que= new LinkedList<>();
		int test_case= Integer.parseInt(st.nextToken());
		
		for(int i=0; i<test_case; i++)
		{
			 //count=0;
			st=new StringTokenizer(br.readLine());
			 arr_size=Integer.parseInt(st.nextToken());
			 st=new StringTokenizer(br.readLine());
			 int px=Integer.parseInt(st.nextToken());
			 int py=Integer.parseInt(st.nextToken());
			 st=new StringTokenizer(br.readLine());
			 int gx=Integer.parseInt(st.nextToken());
			 int gy=Integer.parseInt(st.nextToken());
			 sb.append(BFS(arr_size,px,py,gx,gy)).append("\n");
			 que.clear();
			
		}
		System.out.println(sb);
	}
	public static int BFS(int size,int present_x, int present_y, int going_x, int going_y)
	{
		boolean[][] visited=new boolean[size][size];
		int count=0;
		que.add(new xy(present_x,present_y,count));
		visited[present_x][present_y]=true;
		while(!que.isEmpty())
		{
		xy cur=que.poll();
		if(cur.x==going_x&&cur.y==going_y)
		{
			return cur.cnt;
		}
		for(int i=0; i<mx.length; i++)
		{
			int now_x=cur.x+mx[i];
			int now_y=cur.y+my[i];
			int now_cnt=cur.cnt;
			if(now_x>=0&&now_x<arr_size&&now_y>=0&&now_y<arr_size)
			{
				if(visited[now_x][now_y]==false)
				{
					que.add(new xy(now_x,now_y,now_cnt+1));	
					visited[now_x][now_y]=true;
				}
			}
		}
		}
		return 0;
	}
}
