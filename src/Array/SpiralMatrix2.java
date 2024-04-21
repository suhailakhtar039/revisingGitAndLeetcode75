package Array;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 5;

        int[][] ans = new int[n][n];
        int startingNumber = 1;
        int up = 0, down = n-1, left = 0, right = n-1;
        while (up<=down && left<=right){
            // first from left to right
            for(int i = left; i <= right; i++)
                ans[up][i] = startingNumber++;
            up++;
            if(!(up<=down && left<=right))break;;
            // second up to down
            for(int i = up; i<=down; i++)
                ans[i][right] = startingNumber++;
            right--;
            if(!(up<=down && left<=right))break;;
            // third right to left
            for(int i = right; i>=left; i--)
                ans[down][i] = startingNumber++;
            down--;
            if(!(up<=down && left<=right))break;;
            // four bottom to up
            for(int i = down; i>=up; i--)
                ans[i][left] = startingNumber++;
            left++;
            if(!(up<=down && left<=right))break;
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
