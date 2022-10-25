import java.io.*;
import java.util.*;
import java.text.*;
class houseNumber{
	int x;
	int y;
	int number;
	houseNumber(int x,int y, int number)
	{
		this.x=x;
		this.y=y;
		this.number=number;
	}
}
public class Main {
	public static int arr[][];
	public static boolean visited[][];
	public static int N;
	public static int count=1;
	public static int mx[]= {-1,1,0,0};
	public static int my[]= {0,0,-1,1};
	public static ArrayList<Integer> A=new ArrayList<>();
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 
		N= Integer.parseInt(br.readLine());
		arr=new int [N][N];
		visited=new boolean[N][N];		
		for(int i=0; i<N; i++)
		{
			String str=br.readLine();
			for(int j=0; j<N; j++)
			{
				arr[i][j]=str.charAt(j)-'0';
			}		
		}
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(visited[i][j]==false&&arr[i][j]==1)
				{
					BFS(i, j,count);
				}
			}
		}
		System.out.println(count-1);
		Collections.sort(A);
		for(int i=0; i<A.size(); i++)
		{
			System.out.println(A.get(i));
		}
	}
	public static void BFS(int x, int y, int cnt)
	{
		int sum=0;
		Queue<houseNumber> que=new LinkedList<>();
		que.add(new houseNumber(x, y, count));
		visited[x][y]=true;
		while(!que.isEmpty())
		{
			houseNumber out=que.poll();
			sum++;
			for(int i=0; i<mx.length; i++)
			{
				int now_x=out.x+mx[i];
				int now_y=out.y+my[i];
				if(now_x>=0&&now_x<N&&now_y>=0&&now_y<N)
				{
					if(arr[now_x][now_y]==1&&visited[now_x][now_y]==false)
					{
						que.add(new houseNumber(now_x, now_y,count ));
						visited[now_x][now_y]=true;
						
					}
				}
			}
		}
		A.add(sum);
		count++;
	}
}
