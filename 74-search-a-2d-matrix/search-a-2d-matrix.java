class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // brute force
        // for(int row=0;row<matrix.length;row++){
        //     for(int col=0;col<matrix[row].length;col++){
        //         if(matrix[row][col]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //optimal solution - binary Search 
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int mid_val = matrix[mid / n][mid % n];       // mid/n gives row num -- mid%n givs col num

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}