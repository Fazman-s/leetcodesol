class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s=s.replace(" ","");

        s= s.replaceAll("[^A-Za-z0-9]", "");
        for(int i=0; i< s.length()/2 ;i++){
            // if(s.charAt(i)==(':')||s.charAt(i)==(',')){
            //    continue;
            // }
            char start= s.charAt(i);
            char end = s.charAt(s.length()-1 -i);

            if(start!=end){
                return false;
            }
        }
        return true;
        
    }
}