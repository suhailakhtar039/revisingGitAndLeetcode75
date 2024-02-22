package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSolution {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int n = nums.length;
        int ans = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i:nums){
            if(!m.containsKey(i)){
                int left = m.containsKey(i-1)?m.get(i-1):0;
                int right = m.containsKey(i+1)?m.get(i+1):0;
                int total = left + right + 1;
                ans = Math.max(ans, total);
                m.put(i,ans);
                m.put(i-left,ans);
                m.put(i+right,ans);
            }
        }
        System.out.println(ans);
    }
}
