class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind == -1){        //the last permutation- return the reverse
            reverse(nums,0); 
        }else{

        for(int i=n-1;i>=ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }


        }
        reverse(nums,ind+1);
    }
    }
    

    static void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    } 
}