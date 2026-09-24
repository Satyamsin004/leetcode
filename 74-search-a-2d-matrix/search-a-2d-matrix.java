class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows - 1;
        int row = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target >= matrix[mid][0] &&
                target <= matrix[mid][cols - 1]) {

                row = mid;
                break;

            } else if (target < matrix[mid][0]) {

                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        if (row == -1) {
            return false;
        }
        low = 0;
        high = cols - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target) {
                return true;
            }

            if (matrix[row][mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}