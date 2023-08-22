class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int[] char_count = new int[26];   //26 letters in alphabets
        for(int i=0;i<s.length();i++){
            char_count[s.charAt(i)-'a']++;    // subtract each element from ascii character of and increment the count by one
            char_count[t.charAt(i)-'a']--;    //do the same as above but decrement the count by one
        }

        for(int count:char_count){          
            if(count != 0){             //if count = 0 -- only then it is an anagram
                return false;
            }
        }
        return true;
    }
}