class Solution {
    public boolean checkPerfectNumber(int num) {
        int count = 1;
        if(num ==1){
            return false;
        }

        for(int i=2 ; i<=Math.sqrt(num); i++){
            if(num%i==0){
                count +=i+num/i;
            }
        }
        
        return count == num;
    }
}