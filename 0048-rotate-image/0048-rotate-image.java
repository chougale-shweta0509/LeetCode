class Solution {
    public void rotate(int[][] matrix) {
        // 1: Transpose the matrix
        transpose(matrix);
        
        // 2: Reverse each row
        reverse(matrix);
    }
    
    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) { 
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    private void reverse(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int si = 0;
            int endi = matrix[i].length - 1;
            while (si < endi) {
                int temp = matrix[i][si];
                matrix[i][si] = matrix[i][endi];
                matrix[i][endi] = temp;
                si++;
                endi--;
            }
        }
    }
}
