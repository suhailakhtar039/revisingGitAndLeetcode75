package DynamicProgramming;

public class MinimumPathSum {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        //1st row
        for (int j = 1; j < m; j++) {
            grid[0][j] += grid[0][j-1] ;
        }
        //1st column
        for (int i = 1; i < n; i++) {
            grid[i][0] += grid[i-1][0];
        }
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[n-1][m-1];
    }
}
