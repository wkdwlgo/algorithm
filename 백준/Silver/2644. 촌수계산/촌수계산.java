import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
		public static ArrayList<Integer> []A;
		//public static int depth=0;
		public static boolean visited[];
		public static int result=0;
		public static int count=0;
	public static void main(String[] args)  throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringBuilder sb=new StringBuilder();
			StringTokenizer st=new StringTokenizer(br.readLine()); 
			int node= Integer.parseInt(st.nextToken());
			A=new ArrayList[node+1];
			visited = new boolean[node+1];
			for(int j=0; j<=node; j++)
			{
				A[j]=new ArrayList<Integer>();
			}
			st=new StringTokenizer(br.readLine()); 
			int start= Integer.parseInt(st.nextToken());
			int end =Integer.parseInt(st.nextToken());
			st=new StringTokenizer(br.readLine()); 
			int edge= Integer.parseInt(st.nextToken());
			for(int i=0; i<edge; i++)
			{
				st=new StringTokenizer(br.readLine()); 
				int s=Integer.parseInt(st.nextToken());
				int e=Integer.parseInt(st.nextToken());
				A[s].add(e);
				A[e].add(s);
			}
			DFS(start,end,0);	
		if(result!=0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println(-1);
		}
	}
	public static void DFS(int parents, int child, int depth)
	{
		if(parents==child)
		{	
			count=depth;
			result=1;
			return;
		}
		for(int i:A[parents])
		{
			if(visited[i]==false)
			{
				visited[i]=true;
				DFS(i,child,depth+1);
				visited[i]=false;//이게 왜 있어야 할까??
			}			
		}
	}
}
