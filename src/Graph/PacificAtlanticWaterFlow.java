package Graph;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    public static void main(String[] args) {
        int[][] heights = new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        List<List<Integer>> ans = pacificAtlantic(heights);

    }

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        boolean [][]upLeft = new boolean[n][m];
        boolean [][]bottomRight = new boolean[n][m];

        for(int i = 0; i < n; i++){
            upLeft[i][0] = true;
            bottomRight[i][m-1] = true;
        }

        for(int j = 0; j<m; j++){
            upLeft[0][j] = true;
            bottomRight[n-1][j] = true;
        }

        // Apply four times-> top, left then right, bottom

        for(int i = 0; i<n; i++){
            dfs(heights,upLeft,i,0);
            dfs(heights, bottomRight,i,m-1);
        }

        for(int j = 0; j<m; j++){
            dfs(heights,upLeft, 0,j);
            dfs(heights,bottomRight,n-1,j);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(upLeft[i][j] && bottomRight[i][j]){
                    ans.add(List.of(i,j));
                }
            }
        }
        // System.out.println(ans);
        return ans;
    }

    private static int[] dx = {-1 , 1 , 0 , 0};
    private static int[] dy = {0 , 0 , -1 , 1};
    private static void dfs(int[][] arr,boolean[][] sea,int i,int j){
        int n = arr.length;
        int m = arr[0].length;
        if(i<0 || i>n || j<0 || j>m)return;
        for(int k=0; k<4; k++){
            int x = i + dx[k];
            int y = j + dy[k];
            // System.out.println("inside loop i = "+ i + " j = " + j);
            // System.out.println("inside loop x = "+ x + " y = " + y);
            if(x>=0 && x<n && y>=0 && y<m && !sea[x][y]){
                // System.out.println("inside if x = "+ x + " y = " + y);
                if(arr[x][y]>=arr[i][j]){
                    // System.out.println("x = " + x + " y = " + y);
                    sea[x][y] = true;
                    dfs(arr,sea,x,y);
                }
            }
        }
    }
}


