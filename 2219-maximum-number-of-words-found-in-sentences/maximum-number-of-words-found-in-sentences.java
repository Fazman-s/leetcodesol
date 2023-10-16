class Solution {
    public int mostWordsFound(String[] sentences) {
      int max=0;

      for(String str : sentences){
          String[] words=str.split(" ");
          int numwords = words.length;

          if(numwords>max){
              max=numwords;
          }
      }
      return max;
      
    }
}