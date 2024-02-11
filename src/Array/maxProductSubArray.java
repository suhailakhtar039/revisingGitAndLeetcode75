package Array;

public class maxProductSubArray {
    public static void solve(){
        int[] nums = {-3, -4, 0, 3, 1};
        int n = nums.length;

        int ans = -9999999;
        int prod1=1,prod2=1;
        for(int i = 0; i<n; i++){
            prod1 *= nums[i];
            prod2 *= nums[n-i-1];
            ans = Math.max(prod1, Math.max(ans, prod2));
            if(nums[i] == 0)
                prod1 = 1;
            if(nums[n-i-1] == 0)
                prod2 = 1;
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        solve();
    }
}
