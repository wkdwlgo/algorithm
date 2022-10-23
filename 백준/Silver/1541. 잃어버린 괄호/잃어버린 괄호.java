import java.io.*;
import java.util.*;
import java.text.*;
public class Main{
	public static int result=0;
	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 
		String str=br.readLine();
		String[] ArrayStr=str.split("-");//https://crazykim2.tistory.com/549 split으로 문자열 가르기
		//int sum=0;
		for(int i=0; i<ArrayStr.length; i++)
		{
			int temp=sumArr(ArrayStr[i]);
			if(i==0)
			{
				result+=temp;
			}
			else
			{
				result-=temp;
			}
			
		}	
		System.out.println(result);
	}
	public static int sumArr(String st )
	{
			int sum=0;
			String[] ArraySum=st.split("[+]");//https://soo-vely-dev.tistory.com/20 에러 이유
			for(int i=0; i<ArraySum.length; i++)
			{
				sum+=Integer.parseInt(ArraySum[i]);
			}
			return sum;
		}
	}
