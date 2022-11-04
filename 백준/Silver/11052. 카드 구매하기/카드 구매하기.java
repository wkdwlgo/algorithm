import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static int N;
	public static int arr[];
	public static int memo[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N= Integer.parseInt(br.readLine());
		arr=new int [N+1];
		memo=new int [N+1];
		StringTokenizer st=new StringTokenizer(br.readLine()); 		
		for(int i=1; i<=N; i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=i; j++)
			{
				memo[i]=Math.max(memo[i], memo[i-j]+arr[j]);
			}
		}
		System.out.println(memo[N]);
	}
	
}
