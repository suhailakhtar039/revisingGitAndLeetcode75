package Array;

public class productOfArrayExceptItself {
    public static void solve(){
        int[] nums = {4,2,3,1};
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        int[] ans = new int[n];
        for(int i = n-2; i>=0; i--)
            suffix[i] = nums[i] * suffix[i+1];
        int prod = 1;
        for(int i = 0; i<n; i++){
            if(i == 0){
                ans[i] = suffix[i+1];
            }
            else if(i == n-1){
                ans[i] = prod;
            }
            else{
                ans[i] = prod * suffix[i+1];
            }
            prod *= nums[i];
        }

        for(int i:ans)
            System.out.println(i);

    }
    public static void main(String []args){
        solve();
    }
}
