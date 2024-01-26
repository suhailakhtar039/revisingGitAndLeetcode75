public class longestCommonSubsequence {
    public static void solve(){
        class Solution {
            public int longestCommonSubsequence(String a, String b) {
                int n = a.length(), m = b.length();
                int[][] ans = new int[n+1][m+1];
                // Arrays.fill(ans,0);
                for(int i=1; i<=n; i++){
                    for(int j=1; j<=m; j++){
                        if(a.charAt(i-1)==b.charAt(j-1))
                            ans[i][j] = 1+ans[i-1][j-1];
                        else
                            ans[i][j] = Integer.max(ans[i-1][j],ans[i][j-1]);
                    }
                }
                return ans[n][m];
            }
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
