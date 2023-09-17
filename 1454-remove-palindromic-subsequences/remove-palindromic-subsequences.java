class Solution {
    public int removePalindromeSub(String s) {
        int start=0;
        int end=s.length()-1;

        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return 2;
            } 
            start++;
            end--;             
        }
        return 1;
    }
}