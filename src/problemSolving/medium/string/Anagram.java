package problemSolving.medium.string;

import java.util.Arrays;

public class Anagram {
    static void isAnagram(String s1, String s2){
        s1 =  s1.replaceAll("\\s","");
        s2 =  s2.replaceAll("\\s","");


        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);


        if(Arrays.equals(ch1,ch2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not a anagram");
        }
    }


    public static void main(String[] args) {
        isAnagram("SilenT","LisTe N");
    }
}


