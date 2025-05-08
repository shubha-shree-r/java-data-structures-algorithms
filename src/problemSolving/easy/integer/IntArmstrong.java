package problemSolving.easy.integer;

public class IntArmstrong {
    public static void main(String[] args) {
        int number = 153;
        int originalNum = 153;
        int result = 0;

        while (number != 0) {
            int reminder = number % 10;
            result += reminder * reminder * reminder;
            number /= 10;
        }
        if (result == originalNum) {
            System.out.println("Given number is a Armstrong");
        }
    }
}
