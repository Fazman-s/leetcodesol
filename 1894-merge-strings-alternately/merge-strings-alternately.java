class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length(), m =word2.length();
        int n1=0, m1=0;
        StringBuilder s = new StringBuilder();

        while(n1<n || m1<m){
            if(n1<n){
                s.append(word1.charAt(n1++));
            }
            if(m1<m){
                s.append(word2.charAt(m1++));
            }
        }
        return new String(s);      
    }
}