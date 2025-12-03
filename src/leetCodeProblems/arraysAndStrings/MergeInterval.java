package src.leetCodeProblems.arraysAndStrings;
//leet code 56

//Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public static int[][] mergeArr(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> merged = new ArrayList<>();

        for(int[] interval : intervals){
           if( merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]){
               merged.add(interval);
           }
           else {
               // Overlap → merge by extending the end value
               merged.get(merged.size() - 1)[1] =
                       Math.max(merged.get(merged.size() - 1)[1], interval[1]);
           }

        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeArr(input);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }


    }
}
