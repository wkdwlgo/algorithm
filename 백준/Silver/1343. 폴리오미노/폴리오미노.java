import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static char charArr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 
		boolean impossible =false;
		String str=br.readLine();
		charArr=new char[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			charArr[i]=str.charAt(i);
		}
		int count=0;
		for(int i=0; i<charArr.length; i++)
		{
			if(charArr[i]=='X') 
			{
				count++;
				
			}
			if(charArr[i]=='.')
			{
				if(count!=0)
				{
					if(count%2==0)
					{
						changeArr(i, count);
						count=0;
					}
					else 
					{
						impossible=true;
						break;
					}
				}
				else 
				{
					continue;
				}
			}
		}
		if(count!=0)
		{
		if(count%2==0)
		
		{
			changeArr(charArr.length, count);
		}
		else 
		{
			impossible=true;
			
		}
		}
		if(impossible==true)
		{
			System.out.println(-1);
		}
		else {
			for(int i=0; i<charArr.length; i++)
			{
				System.out.print(charArr[i]);
			}
		}
	}
	public static void changeArr(int index, int sum)
	{
		int four=sum/4;
		for(int i=index-sum; i<(index-sum)+four*4; i++)
		{
			charArr[i]='A';
		}
		for(int i=(index-sum)+four*4; i<index; i++)
		{
			charArr[i]='B';
		}
	}

}
