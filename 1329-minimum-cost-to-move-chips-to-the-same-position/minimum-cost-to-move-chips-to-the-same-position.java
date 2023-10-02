class Solution {
    public int minCostToMoveChips(int[] position) {
        int even =0;
        int odd = 0;
        for(int i=0;i<position.length;i++){
            if(position[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        if(even > odd){
            return odd;
        }else {
            return even;
        }
    }
    
}
/*
each and every chips at odd position can be taken to position 1 at 0 cost and each and every chips at even position can be taken to position 2 at 0 cost.
we have all the chips at position 1 and 2 only. And now we have to decide whether to take all the chips from position 2 to 1 or position 1 to 2, and in both the cases cost will be 1 per chips.
so better will be to pick minimum of the two and put it to the other index to have minimum cost
*/