public class ReverseBits {
    public static void solve(){
        int n = 11;
        int ans = 0;
        while(n!=0){
            ans <<= 1;
            if((n&1)!=0){
                ans = ans | 1;
            }
            n>>=1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        solve();
    }
}
