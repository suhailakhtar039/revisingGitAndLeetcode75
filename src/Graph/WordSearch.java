package Graph;

public class WordSearch {
    private static int[][] direction = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        boolean ans = false;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (word.charAt(0) == board[i][j]) {
                    ans = dfs(board, word, vis, index, i, j);
                    if (ans) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, boolean[][] vis, int index, int i, int j) {
        if (index == word.length())
            return true;
        int n = board.length;
        int m = board[0].length;
        boolean valid = (i<0 || i>=n || j<0 || j>=m);
        if(valid || vis[i][j] || word.charAt(index) != board[i][j])
            return false;

        boolean ans = false;
        vis[i][j] = true;

        for (int k = 0; k < 4; k++) {
            int newI = i + direction[k][0];
            int newJ = j + direction[k][1];

            if(dfs(board,word,vis,index+1,newI,newJ))
                return true;

        }
        vis[i][j] = false;
        return ans;
    }
}
