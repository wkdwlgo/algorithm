import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
	static ArrayList<Integer>[]A;
	static int n;
	static int m;
	static int k;
	static int x;
	static int visited[];
	static List<Integer> answer;//list와 Arraylist의 차이 https://yoon-dailylife.tistory.com/7
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st=new StringTokenizer(br.readLine()); 
		n= Integer.parseInt(st.nextToken());//도시의 개수 
		m= Integer.parseInt(st.nextToken());//도로의 개수 
		k= Integer.parseInt(st.nextToken());//거리 정보 
		x= Integer.parseInt(st.nextToken());//출발 도시의 번호  
		A=new ArrayList[n+1];
		visited=new int[n+1];
		answer=new ArrayList<>();//배열리스트 써도 되고, 연결리스트 써도 됨
		for(int j=1; j<=n; j++)
		{
			A[j]=new ArrayList<Integer>();
		}
		for(int i=0; i<m; i++)
		{
			st=new StringTokenizer(br.readLine()); 
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			A[start].add(end);
		}
		for(int i=0; i<=n; i++)
		{
			visited[i]=-1;
		}
		BFS(x);
		for(int i=1; i<=n; i++)
		{
			if(visited[i]==k)
			{
				answer.add(i);
			}
		}
		if(answer.isEmpty())
		{
			System.out.println(-1);
		}
	Collections.sort(answer);
	for(int k:answer)
	{
		System.out.println(k);
	}
	
	}
	public static void BFS(int node)
	{ 
		Queue<Integer> que = new LinkedList<>();
		que.add(node);
		visited[node]++;
		while(!que.isEmpty())
		{
			int n=que.poll();
			for(int i:A[n])
			{
				if(visited[i]==-1)
				{
					visited[i]=visited[n]+1;
					que.add(i);
				}
			}
		}
	}
}
