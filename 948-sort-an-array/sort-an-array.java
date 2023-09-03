class Solution {
    public int[] sortArray(int[] nums) {
     PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for(int n:nums){
            pQ.add(n);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=pQ.poll(); 
        }
        
       return nums;
    }
                                                   
}