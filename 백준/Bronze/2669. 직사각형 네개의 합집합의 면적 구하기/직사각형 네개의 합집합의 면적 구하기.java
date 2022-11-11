import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static boolean visited[][]=new boolean[101][101];
	public static int count=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<4; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 	
			int x1= Integer.parseInt(st.nextToken());
			int y1= Integer.parseInt(st.nextToken());
			int x2= Integer.parseInt(st.nextToken());
			int y2= Integer.parseInt(st.nextToken());
			for(int y=y1; y<y2; y++)
			{
				for( int x=x1; x<x2; x++)
				{
					visited[y][x]=true;
				}
			}
			
		}
		for(int i=0; i<=100; i++)
		{
			for(int j=0; j<=100; j++)
			{
				if(visited[i][j]==true)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	
}
