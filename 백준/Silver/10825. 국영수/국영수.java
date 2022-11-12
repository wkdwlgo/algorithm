import java.io.*;
import java.util.*;
import java.text.*;
class grade_List
{
	String name;
	int kor;
	int eng;
	int math;
	public grade_List(String name, int kor, int eng, int math)
	{
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<grade_List> list=new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringBuilder sb=new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine()); 	
			String student=st.nextToken();
			int kor_grade=Integer.parseInt(st.nextToken());
			int eng_grade=Integer.parseInt(st.nextToken());
			int math_grade=Integer.parseInt(st.nextToken());
			list.add(new grade_List(student, kor_grade, eng_grade, math_grade));
		}//https://chickenpaella.tistory.com/24
		 Collections.sort(list, new Comparator<grade_List>() {
	            @Override
	            public int compare(grade_List o1, grade_List o2) {
	                if (o1.kor < o2.kor) return 1;
	                if (o1.kor == o2.kor) {
	                	if(o1.eng<o2.eng) return -1;
	                	if(o1.eng==o2.eng)
	                	{
	                		if(o1.math<o2.math) return 1;
	                		if(o1.math==o2.math)
	                		{
	                			int size=Math.min(o1.name.length(), o2.name.length());
	                			for(int i=0; i<size; i++)
	                			{
	                				if(o1.name.charAt(i)!=o2.name.charAt(i))
	                				{
	                					if((int)o1.name.charAt(i)>(int)o2.name.charAt(i))
	                						return 1;
	                					else 
	                						return -1;
	                				}
	                			}
	                		}
	                		if(o1.math>o2.math) return -1;
	                	}
	                	if(o1.eng>o2.eng) return 1;	
	                }
	                if (o1.kor > o2.kor) return -1;
	              return 0;
	            }
	        });
		 for(int i=0; i<n; i++)
		 {
			 System.out.println(list.get(i).name);
		 }

	}

}
