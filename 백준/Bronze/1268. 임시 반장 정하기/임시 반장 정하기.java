import java.io.*;
import java.util.*;
import java.text.*;
import java.time.*;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder sb=new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int arr[][]=new int[n][5];
		int maxStudent=0;
		int answer=0;
		for(int i=0; i<n; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 	
			for(int j=0; j<5; j++)
			{
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<n; i++)
		{
			HashSet<Integer> class_Number= new HashSet<Integer>();//중복제거를 위해 해쉬세트 사용
			for(int j=0; j<5; j++)
			{
				for(int k=0; k<n; k++)
				{
					if(arr[i][j]==arr[k][j]&&i!=k)
					{
						class_Number.add(k);
					}
				}
			}
			if(class_Number.size()>maxStudent)
			{
				answer=i;
				maxStudent=class_Number.size();
			}
			else if(class_Number.size()==maxStudent)
			{
				continue;
			}
			class_Number.clear();
		}
		System.out.println(answer+1);
	}
}
