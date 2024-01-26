package dynamicProgramming;

public class LongestIncreasingSubsequence {
    public static void solve(){
        int[] nums= {10,9,2,5,3,7,101,18};

        int n = nums.length;
        int []ans = new int[n];
        for(int i =0; i<n; i++)
            ans[i] = 1;
        for(int i = 0; i<n; i++){
            int val = 0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    val = Integer.max(val,ans[j]);
                }
            }
            ans[i]+=val;
        }
        int k = ans[0];
        for(int a:ans)
            k = Integer.max(k,a);
        System.out.println(k);
    }
    public static void main(String[] args) {
        solve();
    }
}
