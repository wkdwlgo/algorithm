import java.io.*;
import java.util.*;
import java.lang.*;
class Solution {
   public static int solution(int n) {
	        int answer = 0;
	        int one_Counter=0;
	        String binaryString_N = Integer.toBinaryString(n);
	        for(int i=0; i<binaryString_N.length(); i++)
	        {
	        	if(binaryString_N.charAt(i)=='1')
	        	{
	        		one_Counter++;
	        	}
	        }
	        int biggerNumber=n+1;
	        while(true)
	        {
	        	String binaryString_BiggerNumber = Integer.toBinaryString(biggerNumber);
	        	int biggerNumber_one_Counter=0;
	        	for(int i=0; i<binaryString_BiggerNumber.length(); i++)
	        	{
	        		if(binaryString_BiggerNumber.charAt(i)=='1')
		        	{
	        			biggerNumber_one_Counter++;
		        	}
	        	}
	        	if(biggerNumber_one_Counter==one_Counter)
	        	{
	        		break;
	        	}
	        	biggerNumber++;
	        }
	        answer=biggerNumber;
	        return answer;  
	    }
}