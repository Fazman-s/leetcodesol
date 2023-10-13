class Solution {
    public int subarraySum(int[] nums, int k) {
        //Optimal - prefix sum method
        int preSum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum += nums[i];
            if(map.containsKey(preSum -k)){
                count += map.get(preSum-k);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;

    }
}



        //brute force TC=O(n^2)

        // int n=nums.length;
        // int count=0;

        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;