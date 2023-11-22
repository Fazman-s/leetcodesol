class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split(" +");   //trims begining and end spaces -- splits trimmed words into array of words
                                            //based on spaces btw -" +"  --one or more spaces 
        // StringBuilder sb=new StringBuilder();
        // for(int i=words.length-1;i>=0;i--){
        //     sb.append(words[i]);
        //     if(i != 0){
        //         sb.append(" ");  // adds space after each word except the the last(in this case i=0)
        //     }
            
        // }
        // return sb.toString();

        int i=0,j=words.length-1;
        while(i<j) {
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            i++;
            j--;
        }
        return String.join(" ", words);


    }
}