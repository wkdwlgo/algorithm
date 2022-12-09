import java.io.*;
import java.lang.*;
import java.util.*;
class Solution
{
    public static int solution(String s)
    {	
		Stack<Character> sta=new Stack<>();
        int answer = 1;
        for(int i=0; i<s.length(); i++)
        {
        	if(sta.size()>0&&sta.peek()==s.charAt(i))
        	{
        		sta.pop();
        	}
        	else
        	{
        	sta.add(s.charAt(i));
        	}
        	
        }
        if(sta.size()>0)
        {
        	answer=0;
        }
        return answer;
    }
}