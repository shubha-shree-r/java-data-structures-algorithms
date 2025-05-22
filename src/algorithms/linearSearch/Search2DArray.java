package algorithms.linearSearch;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 56}, {18, 12}};
        int target = 34;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
