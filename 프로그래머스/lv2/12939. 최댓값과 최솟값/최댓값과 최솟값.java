import java.util.*;
import java.io.*;
import java.lang.*;
class Solution {
   
	 public String solution(String s) {
	        String answer = "";
	        ArrayList<Integer> list=new ArrayList<Integer>();
	        String[] str = s.split(" ");
	        
	        for(int i=0; i<str.length; i++) {
	            list.add(Integer.parseInt(str[i]));
	        }
	   
	       
	        answer = "" + Collections.min(list) + " " + Collections.max(list);
	        return answer;
	    }
}