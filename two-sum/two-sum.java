class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
           if(map.containsKey(target -nums[i] )){ // 9 -2 =7 yes
               res[0]=i;  // 0
               res[1]=map.get(target-nums[i]);// 1 

           }
           map.put(nums[i],i);
       }
       return res;  // [0,1]
        
    }
}