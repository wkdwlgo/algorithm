import java.io.*;
import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		PriorityQueue<Integer> priorityQueue= new PriorityQueue<>();//출처: https://crazykim2.tistory.com/575 [차근차근 개발일기+일상:티스토리], 그냥 우선순위큐를 입력하면 알아서 오름차순으로 
		int N= Integer.parseInt(st.nextToken()); 
		//int arr[]=new int [N];
		for(int i=0; i<N; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			int number=Integer.parseInt(st.nextToken()); 
			priorityQueue.add(number);
		}
		int sum=0;
		int result=0;
		while(priorityQueue.size()!=1)
		{
			sum=0;
			sum+=priorityQueue.poll();
			sum+=priorityQueue.poll();
			priorityQueue.add(sum);
			result+=sum;
		}
		
		System.out.println(result);
	}
}
