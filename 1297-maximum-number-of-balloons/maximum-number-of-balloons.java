class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> balloons = new HashMap<>();
        balloons.put('b',0);
        balloons.put('a',0);
        balloons.put('l',0);
        balloons.put('o',0);
        balloons.put('n',0);

        for(char c : text.toCharArray()){
            if(balloons.containsKey(c)){
                balloons.put(c, balloons.get(c)+1);
            }
        }

return (Math.min(balloons.get('b'), Math.min(balloons.get('a'), Math.min(balloons.get('l') / 2, Math.min(balloons.get('o') / 2, balloons.get('n'))))));
    }
    
}