import java.io.*;
import java.lang.*;
import java.util.*;
class Solution {
    public static int solution(String[][] clothes) {
	        int answer = 1;
	       HashMap<String, Integer> map= new HashMap<>();
	       for(int i=0; i<clothes.length; i++)
	       {
	    	   if(map.get(clothes[i][1]) == null) {
	    			map.put(clothes[i][1], 1);
	    		}
	    		else {
	    			map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
	    		}
	    			
	       }
	       
	       for(String s : map.keySet()) {
	    		//옷의 개수 + 옷을 고르지 않는 경우
	    		answer *= (map.get(s) + 1);
	    	}
	       
	        return --answer;
	    }
}