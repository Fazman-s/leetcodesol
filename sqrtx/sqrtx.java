// class Solution {
//     public int mySqrt(int x) {
//         int start=0;
//         int end=x;
//         int ans =0;
//         while(start<=end){
//             int mid=start + (end - start)/2;
//             if(mid*mid == x){
//                 return mid;
//             }
//             if(mid*mid>x){
//                 end=mid-1;
//             }else{
//                 start=mid + 1;
//                 ans=mid;
//             }
//         }
//         return ans;
    
//     }
// }

class Solution {
    public int mySqrt(int x) {
        int low = 1 , high = x  , ans = 0;

            while (low <= high){
              int mid = low + (high - low) /2;

                if (x/mid == mid) return mid;
                else if (x/mid < mid)  high = mid-1;
                else {
                    low= mid + 1; ans=mid;
                }
            }
        return ans;
    }
    
}