class Solution {
    public int longestConsecutive(int[] nums) {
        // better approach
        // int n=nums.length;
        // Arrays.sort(nums);

        // if(n==0){
        //     return 0;
        // }

        // int cnt = 0;
        // int longest=1;
        // int last_smaller=Integer.MIN_VALUE;

        // for(int i=0;i<n;i++){
        //     if(nums[i]-1 == last_smaller){
        //         cnt+=1;
        //         last_smaller=nums[i];
        //     }
        //     else if(last_smaller != nums[i]){
        //         cnt=1;
        //         last_smaller = nums[i];
        //     }
        //     longest = Math.max(longest, cnt);
        // }
        // return longest;


        //most optimal approach without using sort
        int n=nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;

    }
}