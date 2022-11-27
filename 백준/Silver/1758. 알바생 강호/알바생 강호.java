import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	int n=Integer.parseInt(br.readLine());
	int arr[]=new int [n+1];
	for(int i=1; i<=n;i++)
	{
		arr[i]=	Integer.parseInt(br.readLine());
	}	
	Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
	Arrays.sort(tmp, Comparator.reverseOrder()); //배열 내림차순
	int number=1;
	long count=0;
	for(int i=0; i<n; i++)
	{
		int tip=tmp[i]-(i+1-1);
		if(tip>0)
		{
			count+=tip;
		}
	}
	System.out.println(count);
	}

}
