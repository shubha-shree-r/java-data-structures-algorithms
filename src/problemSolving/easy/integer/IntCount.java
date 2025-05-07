package problemSolving.easy.integer;

public class IntCount {

    public void getIntCount(int number){

        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        IntCount intCount = new IntCount();
        intCount.getIntCount(12345678);
    }
}
