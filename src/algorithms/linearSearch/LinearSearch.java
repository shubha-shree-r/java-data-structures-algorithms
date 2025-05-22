package algorithms.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
      int[] nums = {10,20,45,19,-9,-345};
      int target = 19;
        int result = linearSearchIndex(nums,target);
        int result1 = linearSearchElement(nums,target);
        boolean result2 = linearSearchBoolean(nums,target);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
//    return the index
    static int linearSearchIndex(int[] nums, int target){
         if(nums.length == 0){
             return  -1;
         }

         for (int index = 0; index <= nums.length; index++){
             int element = nums[index];
             if (element == target){
                 return index;
             }
         }
         return  -1;
    }
//    return element
    static int linearSearchElement(int[] nums, int target){
        if(nums.length == 0){
            return  -1;
        }

        for (int element : nums){

            if (element == target){
                return element;
            }
        }
        return  -1;
    }
    //    return boolean
    static boolean linearSearchBoolean(int[] nums, int target){
        if(nums.length == 0){
            return  false;
        }

        for (int element : nums){

            if (element == target){
                return true;
            }
        }
        return  false;
    }
}
