class Solution {
    public String reverseVowels(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            if(!isVowels(ch[start])){
                start++;
            }else if(!isVowels(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return String.valueOf(ch);
    }

    public boolean isVowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}