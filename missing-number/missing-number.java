class Solution {
    public int missingNumber(int[] nums) {
        int res;
        int n = nums.length; //eg {3,0,1} --> n=3
        res = n*(n+1)/2; //sum of the numbers int the array(since in order)-- 3*4/2 = 6
        int temp =0;
        for(int i:nums){
            temp+=i;  // sum of the given array i.e = 4
        }
        return res-temp;// 6-4 = 2(missing number)
    }
}