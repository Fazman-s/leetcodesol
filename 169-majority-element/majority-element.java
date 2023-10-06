class Solution {
    public int majorityElement(int[] nums) {
        //optimal solution
        //Moore's voting algo
        //Time complexity : O(n)
        int n=nums.length;
        int count=0;
        int el=0;

        for(int i=0;i<n;i++){
            if(count == 0){
                count = 1;
                el=nums[i];
            }
            else if(el==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el){
                count1++;
            }

        }
        if(count1 > n/2){
            return el;
        }
        return -1;
        
    }
       
}
/*solution1 : TC: > n^2
 // Base case...
        if (nums.length == 1) {
		    return nums[0];
	    }
        // Sort nums array...
        Arrays.sort(nums);
        
        // Since the majority element appears more than n / 2 times...
        // The n/2 -th element in the sorted nums must be the majority element...
	    return nums[nums.length / 2];

        ------------

        solution 2 : better solution : TC - O(nlogn)+O(n)

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
*/        