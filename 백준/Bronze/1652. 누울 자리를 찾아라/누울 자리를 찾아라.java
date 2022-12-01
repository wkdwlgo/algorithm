import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb= new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		char arr[][]= new char[n][n];
		boolean vitised[][]= new boolean [n][n];
		for(int i=0; i<n; i++)
		{
			String str= br.readLine();
			for(int j=0; j<str.length(); j++)
			{
				arr[i][j]=str.charAt(j);
			}
		}
		int colCount=0;
		int rowCount=0;
		int count=0;
		int stop=0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(arr[i][j]=='.')
				{
					count++;
					if(count>1&&stop==0)
					{
						colCount++;
						stop=1;
					}
				}
				if(arr[i][j]=='X')
				{
					count=0;
					stop=0;
				}
			}
			count=0;
			stop=0;
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(arr[j][i]=='.')
				{
					count++;
					if(count>1&&stop==0)
					{
						rowCount++;
						stop=1;
					}
				}
				if(arr[j][i]=='X')
				{
					count=0;
					stop=0;
				}
			}
			count=0;
			stop=0;
		}
	
		System.out.println(colCount+" "+rowCount);
	}

}
