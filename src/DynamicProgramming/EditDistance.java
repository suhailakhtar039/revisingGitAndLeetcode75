package DynamicProgramming;

public class EditDistance {
    public static void main(String[] args) {

    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n == 0 && m == 0)
            return 0;
        if (n == 0 || m == 0) {
            return Math.max(n,m);
        }
        int[][] grid = new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if(i == 0)
                    grid[i][j] = j;
                else if(j == 0)
                    grid[i][j] = i;
                else if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    grid[i][j] = grid[i - 1][j - 1];
                else
                    grid[i][j] = 1 + Math.min(grid[i - 1][j], Math.min(grid[i][j - 1], grid[i - 1][j - 1]));
            }
        }
        return grid[n][m];
    }
}
