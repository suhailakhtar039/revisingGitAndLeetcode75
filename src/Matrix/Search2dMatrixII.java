package Matrix;

public class Search2dMatrixII {
    public static void main(String[] args) {
        int n = 3,m=4;
        int [][]matrix = new int[n][m];
        int key = 4;
        boolean ans = searchMatrix(matrix,key);
    }
    public static boolean searchMatrix(int[][] matrix, int key) {
        int n = matrix.length, m = matrix[0].length;
        int st = 0, en = m-1;
        while(st < n && en >= 0){
            if(matrix[st][en] == key){
                // System.out.println(matrix[st][en]);
                return true;
            }
            else if(key < matrix[st][en])
                en--;
            else
                st++;
        }
        return false;
    }
}
