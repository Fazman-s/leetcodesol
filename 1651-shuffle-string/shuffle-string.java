class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[indices[i]] = s.charAt(i);     //indices=[4,5]--ch[index[1]]-ch[5]=s[1];
        }
        return String.valueOf(ch);
    }
}