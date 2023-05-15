//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
       if(N<=1){
           return 0;
       }
       int c=2;
       while(c*c <= N){
           if(N%c==0){
               return 0;
           }
           c++;
       }
       return 1;
    }
}