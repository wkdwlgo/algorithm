import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(String msg) {
        int[] answer;
        HashMap<String ,Integer> map = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        boolean find= false;
        for(char i='A'; i<='Z'; i++)
	        {
	        	String st= "";
	        	st=st+i;
	            map.put(st, (int)i-64);
	        }
        int index=0;
        int length=msg.length();
        int w=1;
        int next=0;
        while(index!=length||index>length)
        {
            String str="";
            for(int i=index+w; i>index; i--)
            {
                if(i>=msg.length())
                {
                    continue;
                }
                str=msg.substring(index,i);
                for(Map.Entry<String, Integer> entry : map.entrySet())
                {
                 // 동일한 값이 있으면 반복문을 종료합니다.
                 if(str.equals(entry.getKey())) 
                 { // 값이 null이면 NullPointerException 예외 발생  
                 int val = entry.getValue();
                 next=i+1;
                 list.add(val);
                 break;
                }
            }
            if(find)
            {
                break;
            }
            }
            str=str+msg.charAt(next);
            map.put(str, map.size()+1);
            if(str.length()>w)
            {
                w=str.length();
            }
            index++;    
        
        }
            answer=new int [list.size()];
            for(int i=0; i<list.size(); i++)
            {
                answer[i]=list.get(i);
            }
        return answer;
    }
}