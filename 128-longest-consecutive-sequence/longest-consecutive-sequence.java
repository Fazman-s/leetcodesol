class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        if(n==0){
            return 0;
        }

        int cnt = 0;
        int longest=1;
        int last_smaller=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]-1 == last_smaller){
                cnt+=1;
                last_smaller=nums[i];
            }
            else if(last_smaller != nums[i]){
                cnt=1;
                last_smaller = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;

    }
}