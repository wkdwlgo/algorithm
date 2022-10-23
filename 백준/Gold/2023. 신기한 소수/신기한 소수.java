import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
public static int N;
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		N= Integer.parseInt(st.nextToken());
		DFS(1,2);
		DFS(1,3);
		DFS(1,5);
		DFS(1,7);
	}
	public static void DFS(int n, int number)
	{
		StringBuilder sb = new StringBuilder();
		if(n==N)
		{
			if(primeNumber(number)==true)
			{
				System.out.println(number);
			}
		}
		for(int i=1; i<=9; i++)
		{
			if(i%2==0)
			{
				continue;
			}
			if(primeNumber(number*10+i)==true)
			{
				DFS(n+1,number*10+i);
			}
			
		}

	}
	public static boolean primeNumber(int number)//소수구하기 함수
	{
		for(int i=2; i<=number/2; i++)
			if(number%i==0)
				return false;	
			return true;
		
	}

}
