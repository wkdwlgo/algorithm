import java.lang.*;
import java.util.*;
import java.io.*;
class Solution {
   public static int solution(int[] arr) {
	        int answer = 0;
	        Arrays.sort(arr);
	       int tmp=arr[0];
	       int last=arr[0];
	       int temp=0;
	       for(int i=1; i<arr.length; i++)
	       {
	    	  if(tmp>arr[i])
	    	  {
	    		  temp=tmp%arr[i];
	    		  tmp=arr[i];
	    	  }
	    	  else
	    	  {
	    		  temp=arr[i]%tmp;
	    		  tmp=tmp;
	    	  }
	    	  while(temp!=0)
	    	  {
	    		 int num=temp;
	    		 temp=tmp%temp;
	    		 tmp=num; 
	    		  
	    	  }
	    	 tmp=(arr[i]*last)/tmp;
	    	 last=tmp;
	       }
	        answer=tmp;
	        return answer;
	    }
}