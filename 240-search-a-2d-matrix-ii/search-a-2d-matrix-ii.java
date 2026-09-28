class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        int m = matrix[0].length;

        while(row >= 0 && col < m){
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col] > target){
                row--;
            }else{
                col++;
            }
        }
        return false;
    }
}