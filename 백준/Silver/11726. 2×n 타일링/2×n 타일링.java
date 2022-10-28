import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static long memo[]=new long [1001];//n이 1000까지 입력받을 수 있기 때문
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(br.readLine());
		System.out.println(tail(N));
	}
	public static long tail(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else if(num==2)
		{
			return 2;
		}
		else if(memo[num]!=0)
		{
			return memo[num];
		}
		else
		return memo[num]= (tail(num-1)+tail(num-2))%10007;//숫자가 너무 커지므로 숫자 오버플로우를 하지 않기 위해 
	}
}
