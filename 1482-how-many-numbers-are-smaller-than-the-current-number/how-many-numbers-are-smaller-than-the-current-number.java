class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }

            }
            ans[i]=count;
            count=0; // after checking for one index, set count=0 for checking the other index
        }
        return ans;
    }
}