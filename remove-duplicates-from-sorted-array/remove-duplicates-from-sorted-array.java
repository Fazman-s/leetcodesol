class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){ // comparing arr[0] & arr[1] [1,1,2]  1!=1 outof loop
                i++;            
                arr[i]=arr[j];  //
            }
        }
        return i+1; //1st itr :0+1
        
    }
}

//second loop; i=0,j=2 , 1!=2 yes - i++ = 1 -- arr[1]=arr[2] -- arr[1]=2
// arr[0,1]=[1,2] unique 