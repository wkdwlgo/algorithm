import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static int arr[][];
	public static int N;
	public static int M;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		arr=new int [N+1][M+1];
		int dp[][]=new int [N+1][M+1];//dp배열로 memorization하기
		for(int i=1; i<=N;i++)
		{
			st=new StringTokenizer(br.readLine()); 
			for(int j=1; j<=M; j++)
			{
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		for(int i=1; i<=N;i++)
		{
			for(int j=1; j<=M; j++)
			{
				dp[i][j]=Math.max(arr[i][j]+dp[i-1][j],arr[i][j]+dp[i][j-1]);
			}
		}
		
		System.out.println(dp[N][M]);
	}
}
