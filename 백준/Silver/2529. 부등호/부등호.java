import java.io.*;
import java.util.*;
import java.text.*;
//class Now{
//	char ch_Now;
//	int num;
//	public Now(char ch_Now, int num)
//	{
//		this.ch_Now=ch_Now;
//		this.num=num;
//	}
//}
public class Main {
	public static int k;
	public static char []iS=new char [10];
	public static List<String> result= new ArrayList<>();
	public static boolean []check=new boolean[10];
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		k= Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<k; i++)
		{
			String str=st.nextToken();
			iS[i]=str.charAt(0);
		}		
		dfs(0, "");
		Collections.sort(result);
		System.out.println(result.get(result.size()-1));
		System.out.println(result.get(0));
	}
	public static void dfs(int size,String num)
	{
		if(size==k+1)
		{
			result.add(num);
			return;
		}
		for(int i=0; i<=9; i++)
		{
			if(check[i])continue;
			if(size==0||ck(Character.getNumericValue(num.charAt(size - 1)), i, iS[size - 1])) {
				check[i]=true;
				dfs(size+1,num+i);
				check[i]=false;	
			}
		}
	}
	public static boolean ck(int a, int b, char c)
	{
		if(c=='<')
		{
			if(a>b)
			{
				return false;
			}
		}
		else if(c=='>')
		{
			if(a<b)
			{
				return false;
			}
		}
		return true;
	}
}
