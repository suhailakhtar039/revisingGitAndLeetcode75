package DynamicProgramming;

public class JumpGame {
    public static void solve(){
        int[] nums={3,2,1,0,4};

        int n = nums.length, reach = 0, i = 0;
        for(i=0; i<=reach && i<n; i++)
            reach = Integer.max(nums[i] +i, reach);
        if(i==n)
            System.out.println("reached");
    }
    public static void main(String[] args) {
        solve();
    }
}
