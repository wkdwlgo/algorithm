import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
public static ArrayList<Integer>A[];
public static int answer[];
public static boolean visited[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int n= Integer.parseInt(st.nextToken());//노드
		int m= Integer.parseInt(st.nextToken());//엣지
		A=new ArrayList[n+1];
		answer=new int [n+1];
		visited=new boolean[n+1];
		for(int i=1;i<=n; i++)
		{
			A[i]=new ArrayList<Integer>();
			answer[i]=0;
		}
		for(int i=0; i<m; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			A[s].add(e);
		}
		for(int i=1; i<=n; i++)
		{
			BFS(i);
			for(int j=1; j<=n; j++)
			{
				visited[j]=false;
			}
		}
		int max=0;
		for(int i=1; i<=n; i++)
		{
			if(max<answer[i])
			{
				max=answer[i];
			}
			
		}
		for(int i=1; i<=n; i++)
		{
			if(answer[i]==max)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void BFS(int node)
	{
		Queue<Integer> que = new LinkedList<>();
		que.add(node);
		visited[node]=true;
		while(!que.isEmpty())
		{
			int n=que.poll();
			for(int i:A[n])
			{
				if(visited[i]==false)
				{
					visited[i]=true;
					answer[i]++;
					que.add(i);
					
				}
			}
		}
	}
}
