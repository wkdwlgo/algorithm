import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args)  throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean arr[][]=new boolean [101][101];
		int N= Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 	
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			for(int j=y;j<y+10; j++)
			{
				for(int k=x; k<x+10; k++)
				{
					arr[j][k]=true;
				}
			}
		}
		int count=0;
		for(int i=0; i<101; i++)
		{
			for( int j=0; j<101; j++)
			{
				if(arr[i][j]==true)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
