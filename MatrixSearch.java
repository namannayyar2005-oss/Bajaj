class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int left = 0;
        int right = rowCount * colCount - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / colCount;
            int col = mid % colCount;
            int value = matrix[row][col];

            if (value == target) {
                return true;
            }

            if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
