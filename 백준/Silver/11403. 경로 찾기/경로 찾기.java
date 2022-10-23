import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
public static int arr[][];
public static boolean visited[];
static ArrayList<Integer>[]A;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int n= Integer.parseInt(st.nextToken());//노드{
		arr=new int [n][n];
		visited=new boolean[n];
		A=new ArrayList[n];
		for(int j=0; j<n; j++)
		{
			A[j]=new ArrayList<Integer>();
			visited[j]=false;
		}
		for(int i=0; i<n; i++)
		{
			 st=new StringTokenizer(br.readLine()); 

			for(int j=0; j<n; j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
				if(arr[i][j]==1)
				{
					A[i].add(j);
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			BFS(i);
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
public static void BFS(int node)
{
	Queue<Integer> que = new LinkedList<>();
	que.add(node);
	while(!que.isEmpty())
	{
		int n=que.poll();
		for(int i:A[n])
		{
			if(visited[i]==false)
			{
				visited[i]=true;
				que.add(i);
				arr[node][i]=1;
			}
		}
	}
	for(int i=0; i<visited.length; i++)//방문배열 초기화
	{
		visited[i]=false;
	}
}
}
