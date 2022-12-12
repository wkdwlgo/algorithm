import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
       // int [] day= new int[progresses.length];
        Queue<Integer> que= new LinkedList<>();
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<progresses.length; i++)
        {
           int count=0;
            for(int j=progresses[i];j<100; j+=speeds[i] )
            {
                count++;
            }
            que.add(count);
        }
        
        int Arr_count=0;
        while(!que.isEmpty())
        {
            
            int day=que.poll(); 
            int distribute=1;
            if(que.size()>=1)
            {
            	 int next=que.peek();
                if(next<=day)
                {                  
                    while(next<=day)
                    {
                        distribute++;
                        que.poll();
                        if(que.size()>0)
                        {
                        	 next=que.peek();
                        }
                        else
                        {
                        	break;
                        }
                       
                    }
                }
            }
            list.add(distribute); 
            Arr_count++;
        }
        answer=new int [ Arr_count];
        for(int i=0; i<list.size(); i++)
        {
            answer[i]=list.get(i);
        }
        return answer;
    }
}