// class Solution {
//     public double myPow(double x, int n) {
//         float ans=1;
//         while(n>0){
//             if((n & 1)==1){
//                 ans*=x;
//             }
//             x*=x;
//             n=n>>1;
//         }
//         return ans;
//     }
// }
// or 
class Solution {
    public double myPow(double x, int n) {
         return (double)Math.pow(x,n);
    }
}

