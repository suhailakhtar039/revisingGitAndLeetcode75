package Array;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {

    }
    public static int threeSumClosest(int[] nums, int target){
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE, diff = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1])continue;
            int j = i+1, k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(diff > Math.abs(sum-target)){
                    ans = sum;
                    diff = Math.abs(sum-target);
                }
                if(sum == target)
                    return sum;
                else if(sum > target)k--;
                else j++;
            }
        }
        return ans;
    }
}
