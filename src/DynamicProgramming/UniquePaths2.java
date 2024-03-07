package DynamicProgramming;

public class UniquePaths2 {
    public static void main(String[] args) {

    }
    public static int uniquePathsWithObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    grid[i][j] = -1;
            }
        }
        if (grid[0][0] == -1 || grid[n - 1][m - 1] == -1)
            return 0;
        int[][] ans = grid;
        //1st row
        for (int j = 1; j < m; j++) {
            if (grid[0][j] != -1)
                ans[0][j] = 1;
            else break;
        }
        //1st column
        for (int i = 0; i < n; i++) {
            if (grid[i][0] != -1)
                ans[i][0] = 1;
            else break;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(grid[i][j] == -1)continue;
                int up = grid[i - 1][j] == -1 ? 0 : grid[i - 1][j];
                int left = grid[i][j - 1] == -1 ? 0 : grid[i][j - 1];
                ans[i][j] = up + left;
            }
        }

//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<m; j++){
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }
        return ans[n-1][m-1];
    }
}
