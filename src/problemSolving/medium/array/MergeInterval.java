package problemSolving.medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    static int[][] merge(int[][] intervals){
        if (intervals.length <= 0){
            return intervals;
        }

        List<int[]> outPut_str = new ArrayList<>();
        int[] current_interval = intervals[0];
        outPut_str.add(current_interval);

        for (int[] interval : intervals){

            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin){
                current_interval[1] = Math.max(current_end,next_end);

            }else{
                current_interval = interval;
                outPut_str.add(current_interval);
            }
        }

        return outPut_str.toArray(new int[outPut_str.size()][]);

    }
    public static void main(String[] args) {
        int[][] inputData = new int[][]{{1,3},{2,6},{8,10},{15,20}};
        System.out.println(Arrays.deepToString(merge(inputData)));

    }
}
