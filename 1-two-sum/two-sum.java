 class Solution {
     public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
       for(int i=0;i<nums.length;i++){
           if(map.containsKey(target -nums[i] )){ // 9 - 2 = 7 yes
               res[0]=i;  // 0
               res[1]=map.get(target-nums[i]);// 1 

           }
           map.put(nums[i],i);
       }
       return res;  // [0,1]
        
    } 
 }
    // brute force method -- time complexity 0(n^2)
//      for(int i=0;i<nums.length;i++){
//          for(int j=i+1;j<nums.length;j++){
//             int complement = target-nums[i];
//              if(nums[j] == complement){
//                  return new int[] {i,j};
//             }
//         }
//      }
//       return new int[] {};

//     }
//  }

