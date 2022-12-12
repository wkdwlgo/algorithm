import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
      public static ArrayList<Integer>[]A;
	    public static boolean a[];
	    public static int answer;
	    public static int solution(int n, int[][] computers) {
	        answer=n;
	        a= new boolean [n];//탐색을 위한 boolean 배열
	        A= new ArrayList[n];
	        for(int i=0; i<n; i++)
	        {
	            A[i]=  new ArrayList<>();
	        }
	        for(int i=0; i<n; i++)
	        {
	            for(int j=0; j<n; j++)
	            {
	                if(i!=j&&computers[i][j]==1)
	                {
	                    A[i].add(j);
	                }
	            }
	        }
	        for(int i=0; i<n; i++)
	        {
	            DFS(i);
	        }
	        
	        return answer;
	    }
	    public static void DFS(int i)
	    {
	        if(a[i])
	        {
	            return;
	        }
	        a[i]=true;
	            for(int k:A[i])
	            {
	            	
	                if(a[k]==false)
	                {
	                	answer--;
	                	DFS(k);
	                }
	           }       
	    }
}