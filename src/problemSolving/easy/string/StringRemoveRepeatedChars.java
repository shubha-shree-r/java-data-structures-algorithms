package problemSolving.easy.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveRepeatedChars {
    public  void removeRepeated(String inputString){
        Set<Character> setInput = new LinkedHashSet<>();

        for (int i = 0; i < inputString.length(); i++) {
            setInput.add(inputString.charAt(i));
        }

        for (Object val : setInput){
            System.out.println(val);
        }
    }

    public void repeatedString(String inputStrings){
        for (int i = 0; i < inputStrings.length(); i++) {
            for (int j = i+1; j < inputStrings.length(); j++) {
                if (inputStrings.charAt(i) == inputStrings.charAt(j)){
                    System.out.println(String.valueOf(inputStrings.charAt(i)));
                }
            }
        }
    }

    public static void main(String[] args) {
        StringRemoveRepeatedChars chars = new StringRemoveRepeatedChars();
//        chars.removeRepeated("shubha is shubhas girls");
        chars.repeatedString("Shubha is good girls");

    }
}
