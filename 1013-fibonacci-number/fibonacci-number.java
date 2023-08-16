/*class Solution {
    public int fib(int n) {
        if(n<=1){
               return n;
           }
           else {
               return fib(n-1) + fib(n-2);
           }
    }
}
  or        
*/  
class Solution {
    public int fib(int n) {
        int a=0,b=1;
        int count=2;

        if(n<1){
            return n;
        }else{

        while(count <= n){
            int temp = b;
            b=a+b;
            a=temp;
            count++;
        }
        }
        return b;

 
    }
}    
        

