import java.util.Arrays;

public class HouseRobber {
    public static int solve(){
        int[] nums = {2,1,1,2};

        int n = nums.length;
        int[] ans = new int[n];
        if(n==1)
            return nums[0];
        if(n<=2){
            ans[0] = Integer.max(nums[0],nums[1]);
            return ans[0];
        }
        ans[0] = nums[0];
        ans[1] = Integer.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++){
            //pick
            int a = nums[i] + ans[i-2];
            //not pick
            int b = ans[i-1];
            ans[i] = Integer.max(a,b);
        }
        int a = ans[n-1];
        System.out.println(a);
        return a;
    }
    public static void main(String[] args) {
        solve();
    }
}
