class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length;     //no of rows
        int m=matrix[0].length;  //no of columns

        List<Integer> ans= new ArrayList<>();
        int left=0 , right = m-1;
        int top=0, bottom=n-1;

        while(top <= bottom && left <= right){
            //right to left
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //top to bottom

            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                //right to left
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){
                //bottom to top
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}