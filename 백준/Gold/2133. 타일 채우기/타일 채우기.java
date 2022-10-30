import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static int memo[]=new int [1001];
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(br.readLine()); 
		// TODO Auto-generated method stub
		System.out.println(tail(N));
	}
	public static int tail(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else if(num==1)
		{
			return 0;
		}
		else if(num==2)
		{
			return 3;
		}
		else if(memo[num]!=0)
		{
			return memo[num];
		}
		int count=3*tail(num-2);
		for(int i=3; i<=num; i++)
		{
			if(i%2==0)
			{
				count+=2*tail(num-i);
			}
		}
		return memo[num]=count;
	}
}
