package src.problemSolving.easy.string;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeatChar {

    public static int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int max_len = 0;
        List<Character> list = new ArrayList<Character>();

        while (end < s.length()) {
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_len = Math.max(max_len, list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }

        }

        return max_len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
