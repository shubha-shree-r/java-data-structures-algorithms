package problemSolving.easy.integer;

public class IntReverse {
    public void getReversedNumber(){
        int num = 12345;
        int reversednum = 0;

        while(num != 0){
            int temp = num % 10;
            reversednum = reversednum * 10 + temp;
            num /= 10;
        }

        System.out.println(reversednum);
    }

    public static void main(String[] args) {
        IntReverse reverse = new IntReverse();

        reverse.getReversedNumber();
    }

}
