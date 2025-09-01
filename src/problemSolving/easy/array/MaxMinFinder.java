package src.problemSolving.easy.array;

public class MaxMinFinder {

    public static int setMax(int[] arr, int n){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int setMin(int[] arr, int n){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] A = { 4, 9, 6, 5, 2, 3 };
        int N = A.length;
        System.out.println("Minimum element is: "
                + setMin(A, N));
        System.out.println("Maximum element is: "
                + setMax(A, N));
    }
}
