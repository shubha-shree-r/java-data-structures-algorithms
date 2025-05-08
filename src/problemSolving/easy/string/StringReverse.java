package problemSolving.easy.string;

public class StringReverse {
    public void getReversedString(String name){
        String reversed = "";

        for (int i = name.length() - 1; i>= 0; i--){
            reversed += name.charAt(i);
        }
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        StringReverse reverse = new StringReverse();
        reverse.getReversedString("Shubha");

    }
}
