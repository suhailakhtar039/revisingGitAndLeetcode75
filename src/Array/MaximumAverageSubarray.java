package Array;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;


        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1; i<n; i++)
            prefixSum[i] = prefixSum[i-1] + nums[i];
        int maxSum = Integer.MIN_VALUE;
        int i = 0, j = k-1;
        while(j<n){
            int sum;
            if(i == 0){
                sum = prefixSum[j];
            }else{
                sum = prefixSum[j] - prefixSum[i-1];
            }
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        System.out.println("maxSum = " + maxSum);
        double avg = (maxSum*1.0)/k;
        System.out.println(avg);
    }
}
