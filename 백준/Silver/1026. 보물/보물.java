import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder sb=new StringBuilder();
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int N=	Integer.parseInt(st.nextToken());
		int A[]=new int [N];
		int B[]=new int [N];
		boolean visited_B[]=new boolean [N];
		st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++)
		{
			A[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++)
		{
			B[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int index_a=0;
		int count=0;
		while(index_a!=N)
		{
			int max=0;
			int index_b=0;
			for(int i=0; i<N; i++)				
			{
				if(B[i]>max&&visited_B[i]==false)
				{
					max=B[i];
					index_b=i;
				}
			}
			count+=(max*A[index_a]);
			visited_B[index_b]=true;	
			index_a++;
		}
		System.out.println(count);
	}
}
