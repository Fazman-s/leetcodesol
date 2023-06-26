class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){  //9-2 =7 exist in nums 
                res[1]=i;  // index 1
                res[0]=map.get(target-nums[i]); // index at 0
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
        
    }
}