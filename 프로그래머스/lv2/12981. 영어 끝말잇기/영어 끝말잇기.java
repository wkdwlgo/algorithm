import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
 public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        boolean end= true;
        int turn=0;
        int missMember=0;
        boolean overlap=false;
        for(int i=1; i<words.length; i++)
        {
        	char lastcha=words[i-1].charAt(words[i-1].length()-1);
        	if(lastcha==words[i].charAt(0))//끝말이 맞을 때 
        	{
        		for(int j=0; j<i; j++)
        		{
        			if(words[i].equals(words[j]))//사용했던 단어가 있었을 때
        			{
        				turn=(i/n)+1;
                		missMember=(i%n)+1;
                		overlap=true;
        				break;
        			}
        		}
        	}
        	else//끝말이 안맞을 때
        	{
        		turn=(i/n)+1;
        		missMember=(i%n)+1;
				break;
        	}
        	if(overlap==true)
        	{
        		break;
        	}
        	
        }
        
       
        answer[1]=turn;
        answer[0]=missMember;
        return answer;
    }
}