import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static int DP[][];
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(br.readLine()); 
		DP=new int [N+1][3];
		DP[1][0]=1;
		DP[1][1]=1;
		DP[1][2]=1;
		for(int i=2; i<=N; i++)
		{
			DP[i][0]=(DP[i-1][0]+DP[i-1][1]+DP[i-1][2])%9901;
			DP[i][1]=(DP[i-1][0]+DP[i-1][2])%9901;
			DP[i][2]=(DP[i-1][0]+DP[i-1][1])%9901;
		}
		System.out.println((DP[N][0]+DP[N][1]+DP[N][2])%9901);
	}

}
