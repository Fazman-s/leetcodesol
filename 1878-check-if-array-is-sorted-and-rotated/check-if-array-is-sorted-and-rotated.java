/*class Solution {
        public boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
or*/

class Solution {
            public boolean check(int[] nums) {
                   int k=0;
                   int n=nums.length;
                   boolean flag=false;

                   if(nums[0] >= nums[n-1]){
                       flag = true;
                   }

                   for(int i=0;i<n-1;i++){
                       if(nums[i] > nums[i+1]){
                           k++;
                       }
                   }

                   if(flag == true && k==1 || k==0){
                       return true;
                   }
                   return false;
}
}