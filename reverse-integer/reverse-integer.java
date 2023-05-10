class Solution {
    public int reverse(int x) {
        int rem; 
        long ans = 0; 
        
        while(x!=0){
            rem = x % 10; 
            ans = ans * 10 + rem; 
            x = x/10; 
        }
        if(ans >= Integer.MIN_VALUE && ans <= Integer.MAX_VALUE)
            return (int)ans; 
         else
             return 0; 
    }    
}