class Solution {
   public static int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = {};
	        if(arr1[0].length!=arr2.length)//arr1열과 arr2행이 맞아야 곱셉 가능 
	        {
	        	return answer;
	        }
	        else
	        {
	        answer=new int [arr1.length][arr2[0].length];
	        for(int i=0; i<answer.length; i++)
	        {
	        	for(int j=0; j<answer[0].length; j++)
	        	{
	        		for(int k=0; k<arr1[0].length; k++)
	        		{
	        			answer[i][j]+=arr1[i][k]*arr2[k][j];
	        		}
	        	}
	        }
	        
	    
	        
	        return answer;
	        }
	    }
}