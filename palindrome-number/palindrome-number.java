// class Solution {
//     public boolean isPalindrome(int x) {
//         int ans=0;
//         int rem;
//         int ld;
//         while(x>0){
//            ld= x%10 ;  //last digit 232%10 = 2(last dogit))
//            ans=(ans*10)+ld; // (0*10)+2 =2 
//             x=x/10;    //232/10 == 23 now x=23 n same procedure follows   
//         }
//         if (x == ans){
//           return true;
//         }else{
//           return false;
//         }
        

//     }
// }

class Solution {
    public boolean isPalindrome(int x) {
      if(x < 0){
          return false;
}

        int ans = 0;
        int num=x;

        while(x > 0){
            int ld = x%10;
            ans = ans*10 + ld;
            x = x/10;
        }

        if(ans == num)
          return true;

        return false;
    }
}