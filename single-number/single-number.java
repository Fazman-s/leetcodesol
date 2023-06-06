class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int i: nums){
            unique^=i;
        }
        return unique;
    }
}