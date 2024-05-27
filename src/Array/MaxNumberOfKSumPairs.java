package Array;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 10;


        Arrays.sort(nums);
        int n = nums.length;
        int st = 0, en = n-1;
        int ans = 0;
        while(st < en){
            int sum = nums[st] + nums[en];
            if(sum == k){
                ans++;
                st++;
                en--;
            }
            else if(sum > k)
                en--;
            else st++;
        }
        System.out.println(ans);
    }
}
