import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
  boolean solution(String s) {
	        boolean answer = true;
	        Stack<Character> sta= new Stack<>();
	        for(int i=0; i<s.length(); i++)
	        {
	        	if(s.charAt(i)==')')
	        	{
	        		if(sta.isEmpty())
	        		{
	        			return false;
	        		}
	        		else
	        		{
	        			sta.pop();
	        		}
	        	}
	        	else
	        	{
	        		sta.push(s.charAt(i));
	        	}
	        }
	        if(!sta.isEmpty())
	        {
	        	answer=false;
	        }
	        return answer;
	    }
}
