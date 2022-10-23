import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int M= Integer.parseInt(st.nextToken());
		int K= Integer.parseInt(st.nextToken());
		int money[]=new int [M];
		
		for(int i=0; i<M; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			money[i]=Integer.parseInt(st.nextToken());
		}
		int present_Money=K;
		int div;
		int count=0;
		for(int i=M-1; i>=0; i--)
		{
			div=0;
			if(present_Money/money[i]>0)
			{
				div=present_Money/money[i];
				count+=div;
				present_Money-=div*money[i];
			}
		}
		System.out.println(count);
	}

}
