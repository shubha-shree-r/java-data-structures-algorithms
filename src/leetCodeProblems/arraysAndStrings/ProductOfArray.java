package src.leetCodeProblems.arraysAndStrings;
//leet code - 238

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

//case 1:Input: nums = [1,2,3,4]; Output: [24,12,8,6]
//case 2:Input: nums = [-1,1,0,-3,3]; Output: [0,0,9,0,0]


import java.util.Arrays;

public class ProductOfArray {

    public static int[] findArray(int[] inputs){
        int n = inputs.length;
          int[] left = new int[n];
          int[] right = new int[n];
          int[] ans = new int[n];

          left[0] = 1;
          for(int i = 1; i< inputs.length; i++){
              left[i] = left[i - 1] * inputs[i - 1];
          }

          right[inputs.length - 1] = 1;
          for(int i = inputs.length - 2; i>= 0; i--){
              right[i] = right[i+1] * inputs[i+1];
          }

          for(int i =0; i< inputs.length; i++){
              ans[i] = left[i] * right[i];
          }
return ans;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        System.out.println(Arrays.toString(findArray(input)));
    }
}
