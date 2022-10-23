import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
static ArrayList<Integer>[]A;
static boolean arr[];
	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine());
		int node= Integer.parseInt(st.nextToken());
		int edge= Integer.parseInt(st.nextToken());
		A=new ArrayList[node+1];
		arr=new boolean[node+1];
		for(int i=1; i<node+1; i++)
		{
			A[i]=new ArrayList<Integer>();
		}
		for(int i=0; i<edge; i++)
		{
			st=new StringTokenizer(br.readLine());
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		int count=0;
		for(int i=1; i<node+1; i++)
		{
			if(!arr[i])//방문하지 않은 노드가 없을 때까지 
			{
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}
	public static void DFS(int i)
	{
		if(arr[i])
		{
			return;
		}
		arr[i]=true;
		for(int j:A[i]) 
		{
			if(arr[j]==false)
			{
				DFS(j);//재귀함수 사용
				
			}
		}
	}
}
