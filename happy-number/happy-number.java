// class Solution {
//     public boolean isHappy(int n) {
//         int ans=0;
//         while(n!=0){
//             for(int i=0;i<=n;i++){
//                 int ld=n%10;
//                 n=n/10;
//                 ans =ans + ((ld*ld) + (n*n));
                

//             }
//         }
//         if(ans == 1){
//                     return true;
//                 }
//                 return false;
//     }
// }

class Solution {
    public int square(int n){
        int s = 0;
        while(n!=0){
            int a = n%10;
            s+= a*a;
            n/=10;
        }

        return s;

        }
    public boolean isHappy(int n) {
        if(n==1)
            return true;
        if(n==2||n==3||n==4)
            return false;
        return isHappy(square(n));
    }
}