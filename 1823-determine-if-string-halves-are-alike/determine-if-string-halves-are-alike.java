class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        int count1=0,count2=0;
        for(int i=0;i<mid;i++){
            if(isVowel(s.charAt(i))){
                count1=count1 + 1;
            }

        }
        for(int j=mid;j<s.length();j++){
            if(isVowel(s.charAt(j))){
                count2=count2+1;
            }
        
        }
        if(count1==count2){
            return true;
        }
        return false;
    }

    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}