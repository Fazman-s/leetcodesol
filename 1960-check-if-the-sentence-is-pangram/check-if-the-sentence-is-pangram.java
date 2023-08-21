class Solution {
    public boolean checkIfPangram(String sentence) {
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<sentence.length();i++){
          map.put(sentence.charAt(i),1);
      }
      return map.size()==26;
    }
}