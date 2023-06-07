class Solution {
    public int[] evenOddBit(int n) {
        int arr[] = new int[2];
        int x = 0;
        while(n > 0)
        {
            int rem = n % 2;
            if(x == 0)
            {
                x = 1;
                if(rem == 1)
                arr[0]++;
            }
            else
            {
                x = 0;
                if(rem == 1)
                arr[1]++;
            }
            n /= 2;
        }
        return arr;
    }
}