import java.io.*;
import java.lang.*;
import java.util.*;

class Solution {
     public static int solution(String str1, String str2) {
	        double answer = 0;
	        str1=str1.toUpperCase();
	        str2=str2.toUpperCase();
	        ArrayList<String> str1_list= new  ArrayList<>();
            ArrayList<String> str2_list= new  ArrayList<>();
            ArrayList<String> str1nstr2= new  ArrayList<>();
	        boolean onlyString=true;
	        for(int i=0; i<str1.length()-1; i++)
	        {
	            String str="";
	            onlyString=true;
	            for(int j=0; j<=1; j++)
	            {
	                if(str1.charAt(i+j)>64&&str1.charAt(i+j)<91)
	                {
	                str=str+str1.charAt(i+j);
	                }
	                else
	                {
	                onlyString=false;
	                break;
	                }
	            }
	            if(onlyString==true)
	            {
	             str1_list.add(str);
	            }
	           
	        }
	        for(int i=0; i<str2.length()-1; i++)
	        {
	             String str="";
	             onlyString=true;
	             for(int j=0; j<=1; j++)
	            {
	                if(str2.charAt(i+j)>64&&str2.charAt(i+j)<91)
	                {
	                str=str+str2.charAt(i+j);
	                }
	                else
	                {
	                onlyString=false;
	                break;
	                }
	            }
	            if(onlyString==true)
	            {
	              str2_list.add(str);
	            }
	        }
            Collections.sort(str1_list);
            Collections.sort(str2_list);
            for(int i=0; i<str1_list.size(); i++)
            {
                for(int j=0; j<str2_list.size(); j++)
                {
                    if(str1_list.get(i).equals (str2_list.get(j)))
                    {
                        str1nstr2.add(str1_list.get(i));
                        str2_list.remove(j);
                        break;
                    }
                }
            }
            if(str1_list.size()==0&&str2_list.size()==0&&str1nstr2.size()==0)
            {
                return 65536;
            }
            answer=(double)str1nstr2.size()/((double)str1_list.size()+(double)str2_list.size())*65536;
	        return (int)answer;
	    }
}