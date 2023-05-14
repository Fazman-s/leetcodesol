//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


class Solution {

    static Long reversedBits(Long X) {

        long rev=0,rem=0;

        int k=1;

        while(k<=32)

        {

            rem=X%2;

            rev=rev*2+rem;

            X=X/2;

            k++;

        }

        return rev;

    }
}

