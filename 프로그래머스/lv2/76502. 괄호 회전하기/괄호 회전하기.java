import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
   public static int solution(String s) {
        int answer = 0;
        Stack<Character> sta=new Stack<Character>();
        String str=s;
        for(int i=0; i<s.length(); i++)
        {
        		if(i>0)
        		{
        			char cha= str.charAt(0);
        			str=str.substring(1, str.length());//문자열 추출
        			str=str+cha;
            	
        		}
        		
        		 for(int j=0; j<str.length(); j++)
        	      {
        			 if(sta.isEmpty())
        			 {
        				 sta.add(str.charAt(j));
        				 continue;
        			 }
        			
        			 
        				 if(sta.peek()=='('||sta.peek()=='{'||sta.peek()=='[')
        				 {
        					 if(str.charAt(j)==')'&&sta.peek()=='(')
        					 {
        						 sta.pop();
        					 }
        					 else  if(str.charAt(j)=='}'&&sta.peek()=='{')
        					 {
        						 sta.pop();
        					 }
        					 else  if(str.charAt(j)==']'&&sta.peek()=='[')
        					 {
        						 sta.pop();
        					 }
        					 else
        					 {
        						 sta.add(str.charAt(j));
        					 }
        				 }
        				 else
        				 {
        					 break;
        				 }
        			 
        		 }
        		 
        		 if(sta.isEmpty())
        		 {
        			 answer+=1;
        		 }
        		 sta.clear();
        }
        
    
        return answer;
    }
}