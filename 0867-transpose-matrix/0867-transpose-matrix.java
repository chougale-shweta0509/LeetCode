class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;          // Number of rows
        int cols = matrix[0].length;      // Number of columns
        int[][] new_matrix = new int[cols][rows]; // Create a new transposed matrix
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                new_matrix[j][i] = matrix[i][j]; // Fill the transposed matrix
            }
        }
        return new_matrix; // Return the transposed matrix
    }
}
