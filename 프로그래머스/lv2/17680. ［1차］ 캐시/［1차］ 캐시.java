import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
    public static int solution(int cacheSize, String[] cities) {
	        int answer = 0;
	        LinkedList<String> list= new LinkedList<>();
	        for(int i=0; i<cities.length; i++)
	        {
	        	String str=cities[i].toUpperCase();
	        	cities[i]=str;
	        }
	       if(cacheSize==0)
	       {
	    	   return cities.length*5;
	       }
	        for(int i=0; i<cities.length; i++)
	        {
	        	
	        	if(list.size()==cacheSize)
	        	{
	        		if(inside(list,i,cities)==true)
	        		{
	        			list.add(cities[i]);
	        			answer+=1;
	        		}
	        		else
	        		{
	        			list.poll();
	        			list.add(cities[i]);
	        			answer+=5;
	        		}
	        	}
	        	else
	        	{
	        		if(inside(list,i,cities)==true)
	        		{
	        			list.add(cities[i]);
	        			answer+=1;
	        		}
	        		else
	        		{
	        			list.add(cities[i]);
	        			answer+=5;
	        		}
	        	}
	        }
	        return answer;
	    }
	 public static boolean inside(LinkedList<String> lis,int index, String arr[])
	 {
		 
		 for(int i=0; i<lis.size(); i++)
		 {
			 if(arr[index].equals(lis.get(i)))
			 {
				 lis.remove(i);
				 return true;
			 }
		 }
		 return false;
	 }
}