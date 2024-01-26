package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void solve(){
        int n = 3,m = 3;
        int[][] matrix = new int[3][3];

        int cnt = 1;
        for(int i=0; i<n; i++)
            for(int j =0; j<m; j++)
                matrix[i][j] = cnt++;

        List<Integer> spiral = new ArrayList<>();
        int up = 0, left = 0, bottom = n-1, right = m-1;
        while(up<=bottom && left<=right){
            // left to right
            for(int j = left; j<= right; j++)
                spiral.add(matrix[up][j]);
            up++;
            if(!(up<=bottom && left<=right))
                break;

            // top to bottom
            for(int i = up; i<=bottom; i++)
                spiral.add(matrix[i][right]);
            right--;
            if(!(up<=bottom && left<=right))
                break;
            //right to left
            for(int j = right; j>=left; j--)
                spiral.add(matrix[bottom][j]);
            bottom--;
            if(!(up<=bottom && left<=right))
                break;
            //bottom to up
            for(int i = bottom; i>=up; i--)
                spiral.add(matrix[i][left]);
            left++;
            if(!(up<=bottom && left<=right))
                break;
        }
        System.out.println(spiral);
    }
    public static void main(String[] args) {
        solve();
    }
}
