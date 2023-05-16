//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		  long low = 1 , high = x  , ans = 0;

            while (low <= high){
              long mid = low + (high - low) /2;

                if (x/mid == mid) return mid;
                else if (x/mid < mid)  high = mid-1;
                else {
                    low= mid + 1; ans=mid;
                }
            }
        return ans;
	 }
}
