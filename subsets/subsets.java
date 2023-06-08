class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
         List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
       //loop will run for 2^n-1 times
       for(int i=0;i<(1<<n) ; i++)
       {
           ArrayList<Integer> list = new ArrayList<>();
           for(int k=0;k<n;k++)
           {
               if((i & (1<<k))>0)
                   list.add(nums[k]);
           }
               ans.add(new ArrayList<>(list));
       }
       return ans;   
    }
}