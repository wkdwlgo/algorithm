import java.util.*;
import java.lang.*;
import java.io.*;
class Solution
{
    
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int B_index=B.length-1;
        for(int i=0;i<A.length; i++)
        {
        	answer+=A[i]*B[B_index];
        	B_index--;
        }
        return answer;
    }
}