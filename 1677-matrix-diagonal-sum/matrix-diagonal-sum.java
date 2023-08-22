class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+= mat[i][i] + mat[i][n-1 -i];  //diagnal ele indexes ii -11,22,33(primary diag),[i][n-1-i]-second diag 
            }
            if(n%2!=0){       //if n is odd the minus the midle ele from sum
             sum -= mat[n/2][n/2];
            }

        return sum;

    }
}