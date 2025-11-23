package leetCodeProblems.arraysAndStrings;

//leet code - 03

//Given a string s, find the length of the longest substring without duplicate characters.

//case 1: Input = "abcabcbb": Output = 3 , abc
//case 2: Input = "bbbbb": Output = 1 , b
//case 3: Input = "pwwkew": Output = 3 , wke

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public static String findString(String data){
        int start = 0;
        int end = 0;
        int max_len = 0;
        int maxStartIndex = 0;

        List<Character> list = new ArrayList<Character>();

        while(end < data.length()){
           if(!list.contains(data.charAt(end))){
               list.add(data.charAt(end));
               end++;
               max_len = Math.max(max_len,list.size());

               if(list.size() > max_len){
                   max_len = list.size();
                   maxStartIndex = start;

               }
           }else{
                list.remove(Character.valueOf(data.charAt(start)));
                start++;
           };

        }
        return   data.substring(maxStartIndex, maxStartIndex + max_len);

    }


    public static void main(String[] args) {
        String str = "abcabcbb";
        String sub = findString(str);
        System.out.println(sub);
        System.out.println(sub.length());
    }
}
