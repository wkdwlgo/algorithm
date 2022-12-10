import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
     public static int solution(int[] citations) {
	        int answer = 0;
	        Arrays.sort(citations);
	    	int h_index=0;
	        for(int i=0; i<citations.length; i++)
	        {
	        	int h=citations.length-i;
	        	if(citations[i]>=h)
	        	{
	        		answer=h;
	        		break;
	        	}
	
	        }	        
	        return answer;
     }
}