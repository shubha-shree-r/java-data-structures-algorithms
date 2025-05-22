package algorithms.linearSearch;

import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Shubha";
        char target = 'u';
        System.out.println(searchString(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean printString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }


        for(char ch : name.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
//    searching element in string
    static boolean searchString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                return true;
            }

        }

        return false;
    }
}
