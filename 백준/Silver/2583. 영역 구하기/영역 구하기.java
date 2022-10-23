import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
	public static int arr[][];
	public static boolean visited[][];
	public static int mx[]= {-1,1,0,0};
	public static int my[]= {0,0,-1,1};
	public static int m;
	public static int n;
	public static int depth=1;
	static ArrayList<Integer> List;
	public static int count=0;
	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		m= Integer.parseInt(st.nextToken());
		n= Integer.parseInt(st.nextToken());
		arr=new int [m][n];
		visited =new boolean [m][n];
		int k=Integer.parseInt(st.nextToken());
		for(int i=0; i<k; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			int fx= Integer.parseInt(st.nextToken());
			int fy= Integer.parseInt(st.nextToken());
			int sx= Integer.parseInt(st.nextToken());
			int sy= Integer.parseInt(st.nextToken());
			for(int j=fy; j<sy;j++)
			{
				for(int l=fx; l<sx; l++)
				{
					visited[j][l]=true;
				}
			}
		}
		List=new ArrayList<>();
	for(int i=0; i<m; i++)
	{
		for(int j=0; j<n; j++)
		{
			if(visited[i][j]==false)
			{
				DFS(i,j);
				List.add(count);
				depth++;
				count=0;
			}
		}
	}
	Collections.sort(List);
	System.out.println(depth-1);	
	for(int i:List)
	{
		System.out.print(i+" ");
	}
	}
	public static void DFS(int x, int y)
	{
		count++;
		visited[x][y]=true;
		arr[x][y]=depth;
		for(int i=0; i<mx.length; i++)
		{
			int now_x=x+mx[i];
			int now_y=y+my[i];
		
			if(now_x>=0&&now_x<m&&now_y>=0&&now_y<n)
			{
				if(visited[now_x][now_y]==false)
				{
				DFS(now_x,now_y);
				}
			}
		}
	}
}
