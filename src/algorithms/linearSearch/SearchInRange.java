package algorithms.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
    int[] arr = {20,10,80,29,9,-2,-1,7,9};
    int target = 9;
    int start = 2;
    int end = 6;
        System.out.println(searchRange(arr,target,start,end));
    }
    static int  searchRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end; index++ ){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
