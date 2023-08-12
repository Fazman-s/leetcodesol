class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return start;  /* If at some point we have our starting index greater than ending index we return the starting index , which indicates that array has no target and start indicates the position at which it need to be inserted.*/

    }
}