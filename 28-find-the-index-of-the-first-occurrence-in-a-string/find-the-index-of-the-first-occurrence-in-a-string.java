class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }

        int length = needle.length();
        String sub = "";

        for(int i = 0; i<=haystack.length() - length; i++){

            if(haystack.charAt(i) == needle.charAt(0) ){
                sub = haystack.substring(i, i+length);
            }

            if(sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}