class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000); 

        int result = map.get(s.charAt(s.length()-1));  //last char-value

        for(int i=s.length()-2;i>=0;i--){  // start from second last character
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){  //eg "IV" -- 1<5 
                result = result - map.get(s.charAt(i));  //  5-1=4
            }else 
            result = result + map.get(s.charAt(i));  // VI -- 1(last) + 5(sec last) = 6

        }
        return result;
    }
}