class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        // since if n= 5; we have to find set bits from 0 to 5 
        // use a for loop till 5 -- and for each i - call countSetsBits(i) and put it in ans array

        for (int i = 0; i <= n; i++) { 
            ans[i] = countSetBits(i);
        }

        return ans;
    }

    public int countSetBits(int n) {     // Brian kerringam's algo for counting set bits in n
        int count = 0;

        while (n > 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
}

// TC: O(n * logn), SC: O(n)