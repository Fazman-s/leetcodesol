class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            if(i==n-1){            
                arr[i] = sum*(-1);
            }
            else{
                arr[i] = i+1;
                sum+=i+1;
            }
        }
        return arr;
    }
}

/*
example n=5;

the for loop iterates till n-1 i.e till the last element(4) (0--4)
inside for loop :
   it checks if i is the last element i.e =4 
   i=0 , no -- else arr[0] = 0+1=1, sum =0+1
   i=1,  no -- arr[1]=1+1=2, sum=1 + (1+1)=3; 
   i=2,  no -- arr[2]=2+1=3, sum=3+ (2+1)=6
   i=3,  no -- arr[3]=3+1=4, sum=6 + (3+1)=10
   i=4, yes -- arr[4]=sum*-1 == -10

   so the arr = [1,2,3,4,-10]  == which adds up to 0
*/