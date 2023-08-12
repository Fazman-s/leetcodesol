class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(matrix[row][col]==target){
                    return true;
                }
            }
        }
        return false;
    }
}