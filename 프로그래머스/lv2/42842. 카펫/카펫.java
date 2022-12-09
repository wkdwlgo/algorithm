class Solution {
    public static int[] solution(int brown, int yellow) {
	        int[] answer = new int [2];
	        int col=0;
	        int row=0;
	        int stop=0;
	      for(int i=3; i<=brown/2; i++)
	      {
	    	  for(int j=3; j<=brown/2; j++)
	    	  {
	    		  if(brown==(i*2+j*2)-4&&yellow==(i-2)*(j-2))
	    		  {
	    			  col=i;
	    			  row=j;
	    			  stop=1;
	    			  break;
	    		  }
	    	  }
	    	  if(stop==1)
	    	  {
	    		  break;
	    	  }
	    	 
	      }
	       answer[1]=col;
	       answer[0]=row;
	        return answer;
	    }
}