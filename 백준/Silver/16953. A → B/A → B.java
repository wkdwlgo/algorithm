import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int A= Integer.parseInt(st.nextToken());  
		int B=Integer.parseInt(st.nextToken());
		int count=1;
		int tmp=B;
		while(A!=tmp)
		{
			 if(tmp<A)
				{
					count=-1;
					break;
				}
			 else if(tmp%2==0)
			{
				tmp/=2;
				count++;
				
			}
			else if(tmp%10==1)
			{
				tmp/=10;
				count++;
			}
			
			else
			{
				count=-1;
				break;
			}
			
		}
		System.out.println(count);
	}

}
