package Matrix;

public class rotateImage {
    public static void solve(){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6,},
                {7, 8, 9}
        };

        int n = matrix.length;

        for(int i = 0; i<n/2; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[n-i-1];
            matrix[n-i-1] = temp;
        }
        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String []args){
        solve();
    }
}
