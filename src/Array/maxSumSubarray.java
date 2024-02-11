package Array;

public class maxSumSubarray {
    public static void solve(){
        int[] nums={2,3,-3,4};
        int n = nums.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i:nums){
            sum += i;
            maxSum = Math.max(sum, maxSum);
            if(sum < 0)
                sum = 0;
        }
    }
    public static void main(String[] args){
        solve();
    }
}
