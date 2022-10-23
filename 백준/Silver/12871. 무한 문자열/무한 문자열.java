import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder sb = new StringBuilder();
		//StringTokenizer st=new StringTokenizer(br.readLine());
		String s= br.readLine();
		String t= br.readLine();
		int sL=s.length();
		int tL=t.length();
		int min=(sL*tL)/gcd(Math.max(sL, tL), Math.min(sL, tL));//함수로 각 문자열 길이 최대 최소를 함수변수에 집어넣기
		String tmp=s;
		while(true) {
			if(s.length()==min)
			{
				break;
			}
			s+=tmp;
		}
		tmp=t;
		while(true) {
			if(t.length()==min)
			{
				break;
			}
			t+=tmp;
		}
		if(s.equals(t))
		{
			System.out.println(1);
		}
		else 
			System.out.println(0);
		
	}
	public static int gcd(int max, int min)
	{
		while(min!=0)
		{
			int reminder=max%min;
			max=min;
			min=reminder;
		}
		return max;
	}

}
