package leetCodeProblems.arraysAndStrings;

//leetcode -01

//Given an array of integers nums and an integer target, return indices of the two numbers
// such that they add up to target.

//case 1: Input: nums = [2,7,11,15], target = 9; Output: [0,1]
//
//case 2: Input: nums = [3,2,4], target = 6; Output: [1,2]
//
//case 3: Input: nums = [3,3], target = 6; Output: [0,1]


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] sum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] sumArray = sum(input, target);
        System.out.println(Arrays.toString(sumArray));
    }
}

// speed= o(n);