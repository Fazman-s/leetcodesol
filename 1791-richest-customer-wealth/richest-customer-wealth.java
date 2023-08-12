class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;

        for(int person=0;person<accounts.length;person++){
            int rowsum=0;
            for(int acc=0;acc<accounts[person].length;acc++){
                rowsum+=accounts[person][acc];
            }  

        if(rowsum>max){
            max=rowsum;
        }

        }
        return max;
   
        
    }
}