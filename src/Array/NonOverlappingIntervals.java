package Array;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };

        Arrays.sort(intervals,(a, b)-> a[1]-b[1]);
//        for(int[] i : intervals){
//            System.out.println(i[0]+ " " + i[1]);
//        }
        int ans = 1;
        int end = intervals[0][1];
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0]>=end){
                ans++;
                end = intervals[i][1];
            }
        }
        System.out.println(intervals.length - ans);
        // return intervals.length - ans;
    }
}
