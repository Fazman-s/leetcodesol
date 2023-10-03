class Solution {
    public void sortColors(int[] nums) {
        //optimized solution - Dutch national Falg algorithm -O(n) 
        int n=nums.length;
        int low=0, mid=0, high=n-1;
        while(mid <= high){
            if(nums[mid]==0){
               swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }

    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

/* 
using bubble sort - time comp-- O(N^2)
        int n=nums.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=1;j<n-i;j++){
                if(nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }
*/        