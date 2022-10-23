import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int N= Integer.parseInt(st.nextToken()); 
		int L= Integer.parseInt(st.nextToken()); 
		int arr[]=new int [N];
		st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++)
		{
			
			arr[i]=Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(arr);
		int count=0;
		int point=0;
		double length=arr[point]-0.5;
		while(length<arr[N-1])
		{
			length+=L;
			count++;
			if(length>arr[N-1])
			{
				break;
			}
			for(int i=N-1; i>=point; i--)
			{
				if(length>arr[i])
				{
					point=i;
					length=arr[point+1]-0.5;
					continue;
				}
			}
		}
		System.out.println(count);	
	}
}
