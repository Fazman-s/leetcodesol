class Solution {
    public int lengthOfLastWord(String s) {
        int index=0;
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)!=' ' && s.charAt(i-1) == ' '){//first non space character that is preceded by a space
                index=i;
                break;
            }
        }
        return s.substring(index).trim().length();
        //or String s1=s.substring(index).trim();
        //trim is used to remove extra spaces - "moon  "- 6 -- but we need length of moon - 4 so use trim 
        //return s1.length();
        
    }
}