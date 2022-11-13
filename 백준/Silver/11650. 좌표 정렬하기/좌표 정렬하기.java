import java.io.*;
import java.lang.*;
import java.util.*;
class coodr{
	int x;
	int y;
	public coodr(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		// TODO Auto-generated method stub
		List<coodr> list=new ArrayList<>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x= Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			list.add(new coodr(x, y));
		}
		Collections.sort(list, new Comparator<coodr>() {
			@Override
			public int compare(coodr o1, coodr o2) {
				// TODO Auto-generated method stub
				if(o1.x>o2.x) return 1;
				if(o1.x==o2.x)
				{
					if(o1.y>o2.y) return 1;
					if(o1.y<o2.y) return -1;
				}
				if(o1.x<o2.x) return -1;
				return 0;
			}
		});
		for(int i=0; i<list.size(); i++)
		{
			System.out.println((list.get(i).x)+" "+(list.get(i).y));
		}
	}

}
