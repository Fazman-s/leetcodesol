class Solution {
    public boolean rotateString(String s, String goal) {
        String s1=s + s;
        if(s.length()!=goal.length()){
            return false;
        }
        return s1.contains(goal);
        
    }
}