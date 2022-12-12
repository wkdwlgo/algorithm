class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int arr[][]= new int[triangle.length][triangle[triangle.length-1].length];
        int ans[][]= new int[triangle.length][triangle[triangle.length-1].length];
        for(int i=0; i<triangle.length; i++)
        {
            for(int j=0; j<triangle[i].length; j++)
            {
                arr[i][j]= triangle[i][j];
            }
        }
        ans[0][0]=arr[0][0];
	        for(int i=0; i<triangle.length-1; i++)
	        {
	            for(int j=0; j<triangle[i].length; j++)
	            {
	                int max1=Math.max(ans[i+1][j],ans[i][j]+arr[i+1][j]);
	                int max2=Math.max(ans[i+1][j+1],ans[i][j]+arr[i+1][j+1]);
	                ans[i+1][j]=max1;
	                ans[i+1][j+1]=max2;
	                int max=Math.max(max1,max2);
	                if(answer<max)
	                {
	                    answer=max;
	                }
	            }
	        }
        return answer;
    }
}