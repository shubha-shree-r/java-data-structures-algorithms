package problemSolving.easy.integer;

public class IntCountEvenOdd {
    public static void main(String[] args) {
        int evenCount = 0, oddCount = 0;
        int num = 1223399457;

        while (num != 0){
            int remainder = num % 10;


            if(remainder % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num /= 10;
        }

        System.out.println(evenCount);
        System.out.println(oddCount);
    }

}
