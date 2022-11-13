import java.io.*;
import java.lang.*;
import java.util.*;
class old_List
{
	int old; 
	String name;
	public old_List(int old, String name)
	{
		this.old=old;
		this.name=name;
	}
}
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		List<old_List> list=new ArrayList<>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int number= Integer.parseInt(st.nextToken());
			String na=st.nextToken();
			list.add(new old_List(number, na));
		}
		Collections.sort(list,new Comparator<old_List>() {
			
			@Override
			public int compare(old_List o1, old_List o2) {
				// TODO Auto-generated method stub
				if(o1.old>o2.old) return 1;
				if(o1.old<o2.old) return -1;
				return 0;
			}
		});	
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).old+" "+list.get(i).name);
		}
		
	}

	

}
