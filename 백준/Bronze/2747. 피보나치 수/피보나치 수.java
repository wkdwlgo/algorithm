import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	static long[] memo;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(br.readLine());
		memo=new long[100];
		System.out.println(Fibonacci(N));
	}
	public static long Fibonacci(int num)
	{
		 
		if(num==0)
		{
			return 0;
		}
		else if(num==1)
		{
			return 1;
		}
		else if(memo[num]!=0)
		{
			return memo[num];
		}
		else
		{
			return memo[num]= Fibonacci(num-1)+Fibonacci(num-2);
		}
	}
}
