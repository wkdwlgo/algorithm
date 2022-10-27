import java.io.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.text.*;
public class Main {
	public static ArrayList<ArrayList<Integer>> A;
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
		A=new ArrayList<>();
		arr=new int[node+1];
		result=new int [node];
		for(int i=0; i<=node; i++)
		{
			A.add(new ArrayList<>());
		}
		
		for(int i=0; i<edge; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			int s=Integer.parseInt(st.nextToken());
			int e=Integer.parseInt(st.nextToken());
			A.get(s).add(e);
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
			for(int j:A.get(n))
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