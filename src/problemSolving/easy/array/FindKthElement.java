package src.problemSolving.easy.array;
import java.util.Random;
public class FindKthElement {

    static int partition(int[] arr, int l, int r) {
        int x = arr[r];
        int i = l;

        // Iterate through the subarray
        for (int j = l; j <= r - 1; j++) {

            // Move elements <= pivot to the left partition
            if (arr[j] <= x) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }

    // Randomizes the pivot to avoid worst-case performance
    static int randomPartition(int[] arr, int l, int r) {
        Random rand = new Random();
        int n = r - l + 1;
        int pivot = rand.nextInt(n);
        int temp = arr[l + pivot];
        arr[l + pivot] = arr[r];
        arr[r] = temp;
        return partition(arr, l, r);
    }

    // function to find the k'th smallest element using QuickSelect
    static int quickSelect(int[] arr, int l, int r, int k) {

        // Check if k is within the valid range of
        // the current subarray
        if (k > 0 && k <= r - l + 1) {

            // Partition the array and get the
            // pivot's final position
            int pos = randomPartition(arr, l, r);

            // If pivot is the k'th element, return it
            if (pos - l == k - 1)
                return arr[pos];

            // If pivot's position is larger than k,
            // search left subarray
            if (pos - l > k - 1)
                return quickSelect(arr, l, pos - 1, k);

            // Otherwise, search right subarray and adjust k
            // (k is reduced by the size of the left partition)
            return quickSelect(arr, pos + 1, r, k - (pos - l + 1));
        }

        // Return infinity for invalid k (error handling)
        return Integer.MAX_VALUE;
    }

    static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        return quickSelect(arr, 0, n - 1, k);
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 4, 19, 26};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}
