import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static ArrayList<Integer>[]A;
	public static boolean visited[];
	public static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int root= Integer.parseInt(br.readLine());
		int node= Integer.parseInt(br.readLine());
		A=new ArrayList[root+1];
		visited=new boolean[root+1];
		for(int j=1; j<=root; j++)
		{
			A[j]=new ArrayList<Integer>();
		}
		for(int i=0; i<node; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 
			int f=Integer.parseInt(st.nextToken());
			int s=Integer.parseInt(st.nextToken()); 
			A[f].add(s);
			A[s].add(f);
		}
		BFS(1);
		System.out.println(count);
	}
	public static void BFS(int start)
	{
		Queue<Integer> que= new LinkedList<>();
		que.add(start);
		visited[start]=true;
		while(!que.isEmpty())
		{
			int n=que.poll();
			for(int i:A[n])
			{
				if(visited[i]==false)
				{
					que.add(i);
					visited[i]=true;
					count++;
				}
			}
		}
		que.clear();
	}
}
