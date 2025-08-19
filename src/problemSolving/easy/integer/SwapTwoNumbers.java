package src.problemSolving.easy.integer;

public class SwapTwoNumbers {

    public static void main(String[] args) {
       int a =20, b =10;

       a = a + b;
       b = a - b;
       a = a - b ;

        System.out.println("a :" + a + " b :" + b);
    }
}
