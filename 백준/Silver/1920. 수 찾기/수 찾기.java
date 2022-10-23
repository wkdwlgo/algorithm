import java.io.*;
import java.util.*;
import java.text.*;
public class Main{
public static int arr[];
public static int checkArr[];
public static boolean check[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		int	N= Integer.parseInt(st.nextToken());
		arr=new int [N];
		st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<N; i++)
		{
			arr[i]= Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);//낮은 것부터 수행하기위해 sort필요 참고: https://coding-factory.tistory.com/549
		st=new StringTokenizer(br.readLine()); 
		int	M= Integer.parseInt(st.nextToken());
		checkArr=new int [M];
		check=new boolean[M];
		st=new StringTokenizer(br.readLine()); 
		for(int i=0; i<M; i++)
		{
			checkArr[i]= Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<M; i++)
		{
			BinarySearch(i,checkArr[i],0,N-1);
		}
		for(int i=0; i<M; i++)
		{
			if(check[i])
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
		}
	}
public static void BinarySearch(int i,int number, int start, int end)
{
	if(arr[end]<number||arr[start]>number)//배열에 있는 수보다 크거나 작다면 바로 리턴
	{
		return;
	}
	int middle=(start+end)/2;
	if(arr[middle]==number)//middle와 number이 같다면 재귀함수 종료
	{
		check[i]=true;
		return;
	}
	else if(arr[middle]>number)
	{
		BinarySearch(i, number,start , middle-1);
	}
	else
	{
		BinarySearch(i, number,middle+1 , end);
	}
}
}
