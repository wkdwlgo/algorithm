import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(br.readLine()); 
		int arr[][]=new int [N][3];
		int result_Arr[][]=new int [N][3];
		for(int i=0; i<N; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 		
			for(int j=0; j<3; j++)
			{
				arr[i][j]= Integer.parseInt(st.nextToken()); 
			}
		}
		for(int i=0; i<3; i++)
		{
			result_Arr[0][i]=arr[0][i];
		}
		for(int i=1; i<N; i++)
		{
			
			for(int j=0; j<3; j++)
			{
				if(j==0)
				{
					result_Arr[i][j]=arr[i][j]+Math.min(result_Arr[i-1][1],result_Arr[i-1][2]);
				}
				else if (j==1)
				{
					result_Arr[i][j]=arr[i][j]+Math.min(result_Arr[i-1][0],result_Arr[i-1][2]);
				}
				else
				{
					result_Arr[i][j]=arr[i][j]+Math.min(result_Arr[i-1][0],result_Arr[i-1][1]);
				}
			}
		}
		int result=result_Arr[N-1][0];
		for(int i=0; i<3; i++)
		{
			if(result>result_Arr[N-1][i])
			{
				result=result_Arr[N-1][i];
			}
		}
		System.out.println(result);
	}

}
