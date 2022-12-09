import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
  
	 public int[] solution(String s) {
	      int[] answer = new int[2];
	        int counter=0;
	    	int zero_Counter=0;
	    	String str="";
	        while(s!="1")
	        {
	        	str="";
	        	for(int i=0; i<s.length(); i++)
	        	{
	        		if(s.charAt(i)=='0')
	        		{
	        			zero_Counter++;
	        		}
	        		else
	        		{
	        			str=str+'1';
	        		}
	        	}
	        	counter++;
	        	if(str=="1")
	        	{
	        		break;
	        	}
	        	int length=str.length();
	        	ArrayList<Integer> list= new ArrayList<Integer>();
	        	while(length>1)
	        	{
	        		if(length%2==0)
	        		{
	        			list.add(0);
	        		}
	        		else
	        		{
	        			list.add(1);
	        		}
	        		length/=2;
	        	}
	        	s="1";
	        	for(int i=list.size()-1; i>=0; i--)
	        	{
	        		
	        		if(list.get(i)==0)
	        		{
	        			s=s+"0";
	        		}
	        		else
	        		{
	        			s=s+"1";
	        		}
	        	}
	        	list.clear();
	        }
	        answer[1]=zero_Counter;
	        answer[0]=counter;
	        return answer;
	 }
	 
}
