class Solution {
    public boolean containsDuplicate(int[] nums) {
         if(nums == null || nums.length <= 1) return false;
         Arrays.sort(nums);
         for(int i=1 ; i < nums.length ; i++)
         {
           int t =nums[i] ^ nums[i-1];
           if(t == 0)return true;
         }
         return false;
    }
}