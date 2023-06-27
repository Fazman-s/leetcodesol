//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
     HashMap<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000); 

        int result = map.get(s.charAt(s.length()-1));  //last char-value

        for(int i=s.length()-2;i>=0;i--){  // start from second last character
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){  //eg "IV" -- 1<5 
                result = result - map.get(s.charAt(i));  //  5-1=4
            }else 
            result = result + map.get(s.charAt(i));  // VI -- 1(last) + 5(sec last) = 6

        }
        return result;
    }
}