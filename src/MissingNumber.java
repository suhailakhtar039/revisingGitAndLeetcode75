public class MissingNumber {
    public static void solve(){
        int nums[] = {0,2,1,4};
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            ans ^= i;
            ans ^= nums[i];
        }
        ans ^= n;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        solve();
    }
}
