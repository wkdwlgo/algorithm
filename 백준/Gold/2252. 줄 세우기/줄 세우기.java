import java.io.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.text.*;
public class Main {
	public static ArrayList<Integer> A[];
	public static Queue<Integer> que=new LinkedList<>();
	public static int arr[];
	public static int result[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int node= Integer.parseInt(st.nextToken());
		int edge=Integer.parseInt(st.nextToken());
		A=new ArrayList[node+1];
		arr=new int[node+1];
		result=new int [node];
		for(int i=1; i<=node; i++)
		{
			A[i]=new ArrayList<>();
		}
		
		for(int i=0; i<edge; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			A[s].add(e);
			arr[e]++;
		}
		for(int i=1; i<=node; i++)
		{
			if(arr[i]==0)
			{
				que.add(i);
			}
		}
		while(!que.isEmpty()) 
		{
			int n=que.poll();
			sb.append(n).append(" ");
			for(int j:A[n])
			{
				if(--arr[j]==0)
				{
					que.add(j);
				}
			}
		}
		System.out.println(sb);
	}
}
