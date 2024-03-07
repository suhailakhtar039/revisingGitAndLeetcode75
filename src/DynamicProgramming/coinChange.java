package DynamicProgramming;

public class coinChange {
    public static void solve(){
        int[] coins = {1,2,5};
        int amount=11;

        int n = coins.length;
        int[] ans = new int[amount+1];
        for(int i = 0; i<=amount; i++){
            ans[i] = Integer.MAX_VALUE;
        }
        ans[0] = 0;
        for(int i = 1; i<=amount; i++){
            for(int j = 0; j<coins.length; j++){
                if(coins[j]<=i){
                    int temp = ans[i-coins[j]];
                    if(temp!=Integer.MAX_VALUE && temp+1<ans[i]){
                        ans[i] = temp+1;
                    }
                }
            }
        }
        if(ans[amount] == Integer.MAX_VALUE)
        {
            System.out.println(-1);
            return;
        }
        System.out.println(ans[amount]);
    }
    public static void main(String[] args) {
        solve();
    }
}
