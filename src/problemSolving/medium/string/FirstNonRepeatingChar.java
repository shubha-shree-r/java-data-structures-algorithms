package problemSolving.medium.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    static char finFirstNonRepeating(String word){
        Map<Character,Integer> charCount = new LinkedHashMap<>();


        for(char c : word.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String word = "testmediums";
        char firstNonRepeating = finFirstNonRepeating(word);

        if (firstNonRepeating != '\0') {
            System.out.println("Repeated : " + firstNonRepeating);
        }else{
            System.out.println("no repeating");
        }

    }
}
