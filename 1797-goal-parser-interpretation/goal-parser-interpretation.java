class Solution {
    public String interpret(String command) {
        String goal1=command.replace("()","o");
        String goal2=goal1.replace("(al)","al");
        return goal2;

    }
}