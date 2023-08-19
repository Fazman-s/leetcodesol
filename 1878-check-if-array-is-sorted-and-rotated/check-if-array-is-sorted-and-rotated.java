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
}*/

class Solution {
            public boolean check(int[] A) {
                    int k = 0, n = A.length;
                    boolean flag=false;

                    if(A[0] >= A[n-1]){
                        flag = true;

                    }

                    for(int i=0;i<n-1;i++){
                        if(A[i]>A[i+1]){
                            k++;
                        }
                    }

                    if(flag ==true && k==1 || k==0){
                        return true;
                    }
                    return false;
}
}