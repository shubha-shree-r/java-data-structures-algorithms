package problemSolving.easy.integer;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 10;
        int first = 0;
        int last = 1;


        for (int i = 0; i < num; i++) {
            System.out.println(first);
            int temp = first + last;
            first = last;
            last = temp;
        }
    }
}
