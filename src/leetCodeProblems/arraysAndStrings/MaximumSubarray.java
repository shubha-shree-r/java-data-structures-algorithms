package leetCodeProblems.arraysAndStrings;

//leet code - 53

import java.util.Arrays;

public class MaximumSubarray {
    public static int[] findArray(int[] input){
        int maxSoFar = input[0];
        int currSoFar = input[0];

        int start = 0;
        int tempStart = 0;
        int end = 0;

        for(int i =1; i < input.length ; i++){
            if(currSoFar + input[i] < input[i]){
                currSoFar = input[i];
                tempStart = i;
            }else{
                currSoFar += input[i];
            }

            if(currSoFar > maxSoFar){
                maxSoFar = currSoFar;
                start = tempStart;
                end = i;
            }
        }
        return Arrays.copyOfRange(input,start,end+1);
    }


    public static void main(String[] args) {
       int[] inputs = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(findArray(inputs)));
    }
}
