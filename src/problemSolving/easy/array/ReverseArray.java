package src.problemSolving.easy.array;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int n = arr.length;

        int[] temp = new int[n];

        for(int i =0; i< n; i++){
            temp[i] = arr[n - i -1];
        }

        for(int i = 0; i<n ; i++){
            arr[i] = temp[i];
        }


    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

//two pointer:
//
//
//   int left = 0;
//int right = arr.length-1;
//
//while(left < right){
//    int temp = arr[left];
//    arr[left] = arr[right];
//    arr[right] = temp;
//        }