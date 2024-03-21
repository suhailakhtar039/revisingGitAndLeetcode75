package Array;

import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,4};
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for (int i=n-1;i>=2;i--) {
            int l = 0, r = i-1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    count += r-l;
                    r--;
                }
                else l++;
            }
        }
        System.out.println(count);
        // return count;
    }
}
