class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;

        int high = rows * cols -1;
        int low = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;

            int row = mid/cols;
            int col = mid % cols;

            int value = matrix[row][col];

            if(value == target){
                return true;
            }else{
                if(value > target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
