import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
   public static int answer = 0;
	public static int solution(int[] numbers, int target) {
        int sum=0;
        DFS(numbers,0,sum,target);
        return answer;
    }
	public static void DFS(int []numbers, int depth, int sum, int target)
	{
		if(depth==numbers.length)
		{
			  if(sum==target)
		        {
		        	answer++;
		        }
			return ;
		}
		DFS(numbers, depth+1,sum+numbers[depth], target);
		DFS(numbers, depth+1,sum-numbers[depth], target);
	}
}