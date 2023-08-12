class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
      
        for(int n : nums){
            if(even(n)){
                count++;
            } 
        }
        return count;
    }

    boolean even(int n){
        int noOfdigits = digits(n);
        
        return noOfdigits%2==0;
       
        }

    int digits(int n){
        int count=0;
        if(n<0){
            n=n*-1;
        }
        if(n==0){
            return 1;
        }
        // while(n>0){
        //     count++;
        //     n=n/10;
        // }
        // return count;

        //shortcut to find num of digits

        return (int)(Math.log10(n)) + 1;
    }

    }
