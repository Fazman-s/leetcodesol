class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);
        }
        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (nums.length / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }
       
}
/*
 // Base case...
        if (nums.length == 1) {
		    return nums[0];
	    }
        // Sort nums array...
        Arrays.sort(nums);
        
        // Since the majority element appears more than n / 2 times...
        // The n/2 -th element in the sorted nums must be the majority element...
	    return nums[nums.length / 2];
*/        