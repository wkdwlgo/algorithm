import java.io.*;
import java.util.*;
import java.text.*;
class coordinate
{
	int x;
	int y;
	public coordinate(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		List<coordinate> list=new ArrayList<>();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder sb=new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 	
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			list.add(new coordinate(x, y));
		}
		Collections.sort(list,new Comparator<coordinate>() {
			@Override
			public int compare(coordinate o1, coordinate o2) {
				// TODO Auto-generated method stub
				if(o1.y>o2.y) return 1;
				if(o1.y==o2.y)
				{
					if(o1.x>o2.x) return 1;
					if(o1.x<o2.x) return -1;
				}
				if(o1.y<o2.y) return -1;
				return 0;
			}
		});
		for(int i=0; i<list.size(); i++)
		{
			System.out.println((list.get(i).x)+" "+(list.get(i).y));
		}
	}

}
