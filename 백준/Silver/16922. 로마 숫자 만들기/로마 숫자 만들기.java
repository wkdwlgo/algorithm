import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
public static int arr[]= {1,5,10,50};
public static int visited[]=new int [10000];
public static int n;
public static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(br.readLine());
		
		DFS(0,0,0);
		
		System.out.println(count);
	}
public static void DFS(int index,int idx,int s)
{
	if(index==n)
	{
		if(visited[s]==0)
		{
			visited[s]=1;
			count++;
		}
		return;
	}
	for(int i=idx; i<4; i++)
	{
		DFS(index+1,i,s+arr[i]);
	}
}
}
