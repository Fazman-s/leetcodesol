class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);

        }

        for(int i=0;i<nums.length;i++){
            target[i]=arr.get(i);
        }
        return target;
   
    }
}