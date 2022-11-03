import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static LinkedList<Integer> list=new LinkedList<>();
	public static int memo[]=new int [11];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int T= Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++)
		{
			int N= Integer.parseInt(br.readLine());
			list.add(plus(N));
		}
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
	public static int plus(int number)
	{
		if(number==1)
		{
			return 1;
		}
		else if (number==2)
		{
			return 2;
		}
		else if (number==3)
		{
			return 4;
		}
		else if(memo[number]!=0)
		{
			return memo[number];
		}
		else 
		return memo[number]=plus(number-1)+plus(number-2)+plus(number-3);
	}
}
