class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
       // Reverse entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int nums[], int start, int end){
    // While start index is less than end index
     while(start < end){
        // Swap elements at start and end indices
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        // Increment start index and decrement end index
        start++;
        end--;
     }
    }


}


/*  brute force
    int n=nums.length;
    if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
    int[] temp = new int[k];
    for (int i = n - k; i < n; i++) {
      temp[i - n + k] = nums[i];
    }
    for (int i = n - k - 1; i >= 0; i--) {
      nums[i + k] = nums[i];
    }

    for (int i = 0; i < k; i++) {
      nums[i] = temp[i];
    }

   */ 