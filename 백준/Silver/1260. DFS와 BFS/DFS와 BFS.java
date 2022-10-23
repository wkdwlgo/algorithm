import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	static ArrayList<Integer>[]A;
	static boolean arr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int node= Integer.parseInt(st.nextToken());
		int edge= Integer.parseInt(st.nextToken());
		int tree= Integer.parseInt(st.nextToken());
		A=new ArrayList[node+1];
		arr= new boolean[node+1];
		for(int i=1; i<node+1; i++)
		{
			A[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<edge; i++)
		{
			st=new StringTokenizer(br.readLine());
			int n= Integer.parseInt(st.nextToken());
			int son=Integer.parseInt(st.nextToken());
			A[n].add(son);
			A[son].add(n);
		}
		for(int i=1; i<node+1; i++)
		{
			Collections.sort(A[i]);//낮은 것부터 수행하기위해 sort필요
		}
		DFS(tree);
		for(int i=1; i<node+1; i++)//방문함수 초기화
		{
			arr[i]=false;
		}
		System.out.println();
		BFS(tree);
	}
	public static void DFS(int tree)
	{
		arr[tree]=true;
		System.out.print(tree+" ");
		for(int i: A[tree])
		{
			if(!arr[i])
			{
				DFS(i);
			}
		}
		
	}
	public static void BFS(int tree)
	{
		Queue<Integer> que = new LinkedList<>();
		que.add(tree);
		arr[tree]=true;
		while(!que.isEmpty())//큐가 비어있을 때까지
		{
			int node=que.poll();
			System.out.print(node+" ");
			for(int i:A[node])
			{
				if(!arr[i])
				{
					que.add(i);
					arr[i]=true;
				}
				
			}
					
		}
		
	}
}
