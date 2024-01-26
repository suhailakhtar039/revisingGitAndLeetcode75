public class UniquePath {
    public static void solve(){
        int n=3,m=7;
        int[][] matrix = new int[n][m];
        matrix[0][0] = 1;
        for(int i = 1; i<m; i++)
            matrix[0][i]+=matrix[0][i-1];
        for(int j = 1; j<n; j++)
            matrix[j][0]+=matrix[j-1][0];
        for(int i = 1; i<n; i++){
            for(int j =1; j<m; j++){
                matrix[i][j]+=matrix[i-1][j]+matrix[i][j-1];
            }
        }
        System.out.println(matrix[n-1][m-1]);
    }
    public static void main(String[] args) {
        solve();
    }
}
