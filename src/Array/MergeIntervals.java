package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,4},{0,4}};
        int[][] ans = merge(intervals);
        System.out.println("answer==============");
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i][0] + ", " + ans[i][1]);
        }
    }
    public static int[][] merge(int[][] mergeIntervals){
        Arrays.sort(mergeIntervals, (o1, o2) -> o1[0]-o2[0]);
        List<int[]> res = new ArrayList<>();
        int[] newInterval = mergeIntervals[0];
        for(int i=1; i<mergeIntervals.length; i++){
            //    new interval is less than this interval
            if(newInterval[1] < mergeIntervals[i][0]){
                res.add(newInterval);
                newInterval = mergeIntervals[i];
            }
            //   new interval is overlapping
            else {
                newInterval[0] = Math.min(newInterval[0],mergeIntervals[i][0]);
                newInterval[1] = Math.max(newInterval[1],mergeIntervals[i][1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
