package problemSolving.easy.string;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void getCharArray(String stringArray){
        char[] str = stringArray.toCharArray();
        Map<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char value : str){
            if(!String.valueOf(value).isBlank()){
                hm.put(value, hm.getOrDefault(value,0)+1);

            }
        }
        System.out.println("The no of occurences of character in a string : " + hm);

    }

    public static void main(String[] args) {
        getCharArray("This is Java-data-structures-algorithm repository");
    }
}
