public class MatrixProblem {
    public static  int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1; 
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        
        while (num <= n * n) {
            // Fill the top row from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++; 
            
            // Fill the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;
            
            // Fill the bottom row from right to left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            
            // Fill the left column from bottom to top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        
        return matrix;
    }
    public static void main(String args[])
    { 
        int n = 3;
        int[][] matrix =generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
