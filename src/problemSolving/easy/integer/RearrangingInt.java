package src.problemSolving.easy.integer;

//Move all negative numbers to beginning and positive to end with constant extra space

import java.util.Arrays;

public class RearrangingInt {

    public static int[] rearrange(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            while(left < right && arr[left] < 0){
                left++;
            }
            while(right > left && arr[right] > 0){
                right++;
            }

            // swap the two values.
            if (right > left) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = rearrange(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
