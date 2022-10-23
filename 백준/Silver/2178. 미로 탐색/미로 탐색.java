import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
static int dx[]= {-1,1,0,0};//상하좌우 define 배열
static int dy[]= {0,0,-1,1};
static int arr[][];
static boolean visited [][];
static int N,M;
	public static void main(String[] args)throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine()); 
			N= Integer.parseInt(st.nextToken());
			M=Integer.parseInt(st.nextToken());
			arr=new int [N][M];
			visited=new boolean [N][M];
			for(int i=0; i<N; i++)
			{
				st=new StringTokenizer(br.readLine()); 
				String str=st.nextToken();//문자열로 배열 처리한 후
				for(int j=0; j<M; j++)
				{
					
					arr[i][j]=Integer.parseInt(str.substring(j, j+1) );//substring를 통해 문자열 가르기
				}
			}
			BFS(0,0);
			System.out.println(arr[N-1][M-1]);
		
	}
	public static void BFS(int x, int y)
	{
		Queue<int []> que = new LinkedList<>();//배열 형태로 큐 입력
		que.offer(new int[] {x,y});//
		visited[x][y]=true;
		while(!que.isEmpty())
		{
			int now[]=que.poll();
			for(int i=0; i<4; i++)
			{
				int nowX=now[0]+dx[i];
				int nowY=now[1]+dy[i];
				if(nowX>=0&&nowY>=0&&nowX<N&&nowY<M)
				{
					if(arr[nowX][nowY]==1&&visited[nowX][nowY]==false)
					{
						visited[nowX][nowY]=true;
						arr[nowX][nowY]=arr[now[0]][now[1]]+1;
						que.offer(new int[] {nowX,nowY});
						
					}
				}
			}
		}
	}
}
