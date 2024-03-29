class Solution {
    public int primePalindrome(int n) {
        while(true){
            if(n==isPalindrome(n) && prime(n)){
                return n;
            }
            n++;
            if (10_000_000 < n && n < 100_000_000)
                n= 100_000_000;
/*If n is range btw 10,000,000 and 100,000,000,set n=100,000,000, which is the next palindrome number after 10,000,000, and then continues to the next iteration*/
        
        }
        
    }

    public boolean prime(int n){
        if(n<2){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n%c== 0){
                return false;
            }
            c++;
        }
        return true;
    }


    public int isPalindrome(int n){
        int num=n;
        int ans=0;

        while(num>0){
          int ld=num%10;
            ans = ans*10 + ld;
            num/=10;
        }
        return ans;
    }
}