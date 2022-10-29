import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static  ArrayList<ArrayList<Integer>> A=new ArrayList<>();
	public static int time_Arr[];
	public static int weight_Arr[];
	//public static boolean visited[];
	public static int result[];
	public static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		N= Integer.parseInt(br.readLine());
		time_Arr=new int [N+1];
		weight_Arr=new int [N+1];
		result=new int [N+1];
		//visited=new boolean[N+1];
		for(int i=0; i<=N; i++)
		{
			A.add(new ArrayList<>());
		}
		for(int i=1; i<=N; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 	
			time_Arr[i]=Integer.parseInt(st.nextToken());
			while(true)
			{
				int end=Integer.parseInt(st.nextToken());
				if(end==-1)
				{
					break;
				}
				A.get(end).add(i);
				weight_Arr[i]++;
			}
		}
		bulidTime();
		for(int i=1; i<=N; i++)
		{
			System.out.println(result[i]+time_Arr[i]);
		}
	
	}
	public static void bulidTime()
	{
		Queue<Integer> que=new LinkedList<>();
		for(int i=1; i<=N; i++)
		{
			if(weight_Arr[i]==0)
			{
				que.add(i);
			}
		}
		while(!que.isEmpty()) 
		{
			int now=que.poll();
			for(int i:A.get(now))
			{
				weight_Arr[i]--;
				result[i]=Math.max(result[i], result[now]+time_Arr[now]);
					if(weight_Arr[i]==0)
					{
						que.add(i);
					}
			}
		}
	}
}
