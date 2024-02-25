package Graph;


public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'0','0','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','1','1'}
            };
        System.out.println(numIslands(grid));

    }
    private static int numIslands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        boolean [][]vis = new boolean[n][m];
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    // System.out.println(i + ", " + j);
                    ans++;
                    dfs(grid, vis, i, j, n, m);
                }
            }
        }
        return ans;
    }

    private static void dfs(char [][] grid, boolean[][] vis, int x, int y, int n,int m){
        if(vis[x][y])
            return;
        vis[x][y] = true;
        if(x-1 >= 0 && grid[x-1][y] == '1' && !vis[x-1][y]) dfs(grid, vis, x-1, y, n, m);
        if(x+1 < n && grid[x+1][y] == '1' && !vis[x+1][y]) dfs(grid, vis,x+1, y, n, m);
        if(y-1 >= 0 && grid[x][y-1] == '1' && !vis[x][y-1]) dfs(grid, vis, x ,y-1, n, m);
        if(y+1 < m && grid[x][y+1] == '1' && !vis[x][y+1]) dfs(grid, vis, x, y+1, n, m);
    }
}
