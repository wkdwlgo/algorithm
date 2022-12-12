import java.io.*;
import java.lang.*;
import java.util.*;

class Solution {
   public static int solution(int[] priorities, int location) {
	        int answer = 0;
	        Queue<Integer> list= new LinkedList<>();
	        Queue<Integer> que= new LinkedList<>();
	        List<Integer> prior= new ArrayList<>();
	        for(int i=0; i<priorities.length; i++)
	        {
	            list.add(i);
	            que.add(priorities[i]);
	            prior.add(priorities[i]);
	        }
	        Collections.sort(prior);
	        int counter=0;
	        while(!que.isEmpty())
	        {
	            int n=que.poll();
	            int number=list.poll();
	            if(n==prior.get(prior.size()-1))
	            {
	                counter++;
	                if(number==location)
	                {
	                    break;
	                }
	                prior.remove(prior.size()-1);
	            }
	            else
	            {
	                que.add(n);
	                list.add(number);
	            }
	        }
	       answer=counter;
	        return answer;
	    }
}