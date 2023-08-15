#User function Template for python3

class Solution:
    def nextPermutation(self, N, arr):
  
     i = N - 2
     while i >= 0 and arr[i] >= arr[i + 1]:
        i -= 1
    
     # If no such index is found, reverse the array and return
     if i == -1:
         arr.reverse()
         return arr
    
     # Find the smallest element in the subarray to the right of index i
     j = N - 1
     while arr[j] <= arr[i]:
         j -= 1
    
     # Swap arr[i] and arr[j]
     arr[i], arr[j] = arr[j], arr[i]
    
     # Reverse the subarray to the right of index i
     arr[i + 1:] = arr[i + 1:][::-1]
    
     return arr


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        arr = input().split()
        for i in range(N):
            arr[i] = int(arr[i])
        
        ob = Solution()
        ans = ob.nextPermutation(N, arr)
        for i in range(N):
            print(ans[i],end=" ")
        print()
# } Driver Code Ends