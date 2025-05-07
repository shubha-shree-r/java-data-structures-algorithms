package problemSolving.easy.string;

public class StringFirstCharUppercase {
    public static void main(String[] args) {
        String input = "shubha is a good girl";
        String[] words = input.split(" ");
        String result = " ";

        for (String word : words){
            result += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1) + " ";

        }

        System.out.println(result);
    }
}
