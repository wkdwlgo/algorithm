import java.io.*;
import java.util.*;
import java.text.*;
public class Main{
public static int arr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int M= Integer.parseInt(st.nextToken());//레슨 수
		int N= Integer.parseInt(st.nextToken());//블루레이 개수
		arr=new int [M];
		int start=0;
		int end=0;
		st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<M; i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			if(start<arr[i])
			{
				start=arr[i];//모든 레슨을 담기위해 start는 최대 입력값으로
			}
			end+=arr[i];//모든 레슨의 합(index의 합)
		}
		while(start<=end)
		{
			int middle=(start+end)/2;
			int sum=0;
			int count=0;
			for(int i=0; i<M; i++)
			{
				if(sum+arr[i]>middle)
				{
					count++;
					sum=0;
				}
				sum+=arr[i];
			}
			if(sum>0)
			{
				count++;
			}
			if(count>N)
			{
				start=middle+1;
			}
			else
			{
				end=middle-1;	
			}
			
		}
		System.out.println(start);
	}
}
