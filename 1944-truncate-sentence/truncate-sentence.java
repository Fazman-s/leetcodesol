class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" +");
        for(int i=0; i<k; i++){
            sb.append(words[i]+" ");
        }
        return sb.toString().trim();
    }
}