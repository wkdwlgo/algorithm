import java.io.*;
import java.util.*;
import java.text.*;
public class Main{
	public static long memo[]= new long [1001]; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int x= Integer.parseInt(br.readLine());
		System.out.println(tail(x));
	}
	public static long tail(int num)
	{
		if(num==1)
		{
			return 1;
		}
		else if(num==2)
		{
			return 3;
		}
		else if(memo[num]!=0)
		{
			return memo[num];
		}
		else
		return memo[num]=(tail(num-1)+2*tail(num-2))%10007;
	}

}
