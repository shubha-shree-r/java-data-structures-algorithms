package problemSolving.easy;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int first = 0;
        int second = 0;


//        System.out.println(Arrays.stream(arr).max());
        for (int num : arr){
            if (first < num){
                second = first;
                first = num;
            } else if (second < num) {
                second = num;
            }
        }

        System.out.println(second);
        System.out.println(first);

    }

}
