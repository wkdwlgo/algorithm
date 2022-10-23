import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	static int N; 
	static int M;
	static ArrayList<Integer>[]A;
	static boolean arr[];
	static boolean arrive;
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
			N= 	Integer.parseInt(st.nextToken());
			M=	Integer.parseInt(st.nextToken());
			A=new ArrayList[N];
			arr=new boolean[N];
			for(int j=0; j<N; j++)
			{
				A[j]=new ArrayList<Integer>();
			}
			for(int i=0; i<M; i++)
			{
				st=new StringTokenizer(br.readLine()); 
				int f=Integer.parseInt(st.nextToken());
				int s=Integer.parseInt(st.nextToken()); 
				A[f].add(s);
				A[s].add(f);
			}
			for(int i=0; i<N; i++)
			{
				DFS(i,1);
				if(arrive==true)
				{
					break;
				}
			}
			if(!arrive)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println("1");
			}
			
	}
	public static void DFS(int n,int depth)
	{
		if(depth==5)
		{
			arrive=true;
			return;
		}
		arr[n]=true;
		for(int i:A[n])
		{
			if(arr[i]==false)
			{			
			DFS(i,depth+1);
			}
		}
		arr[n]=false;//다음 for문을 위해 불린 배열 초기화(이것 땜에 오래 걸림)
	}
}
