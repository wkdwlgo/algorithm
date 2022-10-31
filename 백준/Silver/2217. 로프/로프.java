import java.io.*;
import java.util.*;
import java.text.*;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st=new StringTokenizer(br.readLine()); 		
		int N= Integer.parseInt(br.readLine());
		Integer arr[]=new Integer [N];
		Integer result[]=new Integer [N];
		for(int i=0; i<N; i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr,Collections.reverseOrder());
		int count=0;
		for(int i=0; i<N; i++)
		{
			if(i==0)
			{
				
				result[i]=arr[i];
				
			}
			else
			{
				int min=arr[i];
				result[i]=min*(i+1);
			}
		}
		int max=0;
		for(int i=0; i<N; i++)
		{
			if(max<result[i])
			{
				max=result[i];
			}
		}
		System.out.println(max);
	}

}
