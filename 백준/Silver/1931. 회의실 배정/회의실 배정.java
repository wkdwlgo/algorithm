import java.io.*;
import java.util.*;
import java.text.*;
public class Main{

	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int N= Integer.parseInt(st.nextToken());
		int arr[][]=new int [N][2];
	
		for(int i=0; i<N; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		// https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html:Comparable, Comparator을 이용하여 Java 객체를 정렬할 수 있다.
		Arrays.sort(arr, new Comparator<int []>() {
			public int compare(int []s, int []e) {
				// TODO Auto-generated method stub
				if(s[1]==e[1])
				{
					return s[0]-e[0];
				}
				return s[1]-e[1];
			}
		});
		int count=0;
		int end_time=0;
	for(int i=0; i<N; i++)
	{
		if(arr[i][0]-end_time>=0)
		{
			end_time=arr[i][1];
			count++;
			
		}
	}
		System.out.println(count);
	}
}
