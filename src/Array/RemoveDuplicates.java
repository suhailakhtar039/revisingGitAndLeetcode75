package Array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,3,3,4,4,4};

        int n = nums.length;
        int i = 0, j = 0;
        for(; i<n-1; i++){
            if(nums[i+1] != nums[i])
                nums[j++] = nums[i];
        }
        nums[j++] = nums[n-1];
        for(int k:nums)
            System.out.println(k);
    }
}
