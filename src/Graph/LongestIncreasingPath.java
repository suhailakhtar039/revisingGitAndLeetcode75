package Graph;

public class LongestIncreasingPath {
    private int[][] direction = {{-1,0},{1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][]cache = new int[n][m];
        int ans  = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                int max = dfs(matrix, i, j, cache);
                ans = Math.max(ans,max);
            }
        }
        return ans;
    }
    public int dfs(int[][] matrix, int i, int j, int[][]cache){
        if(cache[i][j]!=0)return cache[i][j];
        int max = 1;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int k = 0; k<4; k++){
            int newI = i + direction[k][0];
            int newJ = j + direction[k][1];
            if(newI< 0 || newI >= n || newJ < 0 || newJ >= m || matrix[newI][newJ] <= matrix[i][j])continue;
            int len = 1 + dfs(matrix,newI,newJ,cache);
            max = Math.max(max,len);
        }
        cache[i][j] = max;
        return max;
    }
}
