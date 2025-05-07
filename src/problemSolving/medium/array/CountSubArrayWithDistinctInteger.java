package problemSolving.medium.array;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithDistinctInteger {

    public static void main(String[] args) {
        int[] number = {1,2,1,3,4};
        int distinct =2;
        int leftpointer = 0;
        int count = 0;

        Map<Integer,Integer> mapVal = new HashMap<>();

        for (int rightpointer = 0; rightpointer < number.length; rightpointer++){
            mapVal.put(number[rightpointer],mapVal.getOrDefault(number[rightpointer],0) + 1);
            while (mapVal.size() > distinct){
                mapVal.put(number[leftpointer],mapVal.getOrDefault(number[leftpointer],0)- 1);
                mapVal.remove(number[leftpointer]);
                leftpointer++;
            }
            count+=rightpointer-leftpointer+1;
        }
        System.out.println(count);
    }
}
