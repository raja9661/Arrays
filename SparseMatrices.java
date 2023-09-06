public class SparseMatrices {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length; // Number of rows in mat1
        int k = mat1[0].length; // Number of columns in mat1
        int n = mat2[0].length; // Number of columns in mat2
        
        int[][] result = new int[m][n]; // Resulting matrix
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the dot product of row i from mat1 and column j from mat2
                for (int p = 0; p < k; p++) {
                    result[i][j] += mat1[i][p] * mat2[p][j];
                }
            }
        }
        
        return result;
    }
    public static void main(String args[])
    {
        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        int[][] result =multiply(mat1, mat2);
        for (int i = 0; i < result.length; i++) {
           for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
             System.out.println();
        }
    
    }   
}
