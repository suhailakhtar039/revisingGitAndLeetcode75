package Array;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};

        int n = nums.length;
        int sum = 0;
        for(int i:nums)sum+=i;

        int leftSum=0, rightSum=sum;
        for(int i = 0; i<n; i++){
            if(i == 0){
                leftSum = 0;
                rightSum = sum-nums[i];
            }else if(i == n-1){
                leftSum = sum-nums[i];
                rightSum = 0;
            }
            else{
                leftSum += nums[i-1];
                rightSum = sum - leftSum - nums[i];
            }
            if(leftSum == rightSum){
                System.out.println("index = " + i);
                System.exit(0);
            }
        }
    }
}
