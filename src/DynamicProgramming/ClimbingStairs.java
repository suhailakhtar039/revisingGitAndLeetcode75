package DynamicProgramming;

public class ClimbingStairs {
    public static void solve(){
        int n=3;
        int a = 1, b = 2, ans = 0;
        if(n<=b){

        }
        for(int i = 3; i<=n; i++){
            ans += a+b;
            a = b;
            b = ans;
        }
    }
    public static void main(String[] args) {
        solve();
    }
}
