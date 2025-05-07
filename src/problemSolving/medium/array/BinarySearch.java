package problemSolving.medium.array;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        int key = 2;
        int low =0;
        int high = nums.length - 1;

        while (low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == key){
                System.out.println("Element found at "+mid+"th index");
                break;
            } else if (nums[mid]<key) {
                low = mid+1;

            }else{
                high = mid-1;

            }
        }
    }
}
