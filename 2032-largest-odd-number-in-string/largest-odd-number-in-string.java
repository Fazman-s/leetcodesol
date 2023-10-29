class Solution {
    public String largestOddNumber(String num) {
        String res="";
        for(int i=num.length()-1;i>=0;i--)  //traversing from the last 
        {
            int n=(int)num.charAt(i)-'0';// converting character to integer
           if(n%2!=0)
           {
               res=res+num.substring(0,i+1);
               break; // break the loop as soon as it finds the last integer as odd number.
           }
        }
        return res;
    }
}
/*
'0': This is a character literal representing the character '0'. In Java, characters are represented as Unicode values, and the character '0' has a Unicode value of 48.
num.charAt(i) - '0': This subtracts the Unicode value of the character '0' from the Unicode value of the character obtained from num.charAt(i). Since characters in Java are represented as numbers (Unicode values), subtracting the Unicode value of '0' effectively converts a digit character (e.g., '0', '1', '2', etc.) to its corresponding integer value (0, 1, 2, etc.).

For example, if num is a string and num.charAt(i) is '3', then n will be assigned the value 3, as '3' - '0' results in 3.
 */