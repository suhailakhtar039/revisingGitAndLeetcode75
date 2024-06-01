package Array;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;


        int i = 0, j = 0, n = nums.length;
        int zeroCount = 0, ans = 0;
        while (j < n && i <= j) {
            if (nums[j] == 0) zeroCount++;
            while (zeroCount > k) {
                if (nums[i] == 0)
                    zeroCount--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        System.out.println(ans);
    }
}
