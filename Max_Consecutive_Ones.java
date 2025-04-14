class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max = 0;
        int l = nums.length;
        for (int i=0 ; i<l ; i++){
            if(nums[i] == 1){ 
                count ++;
                 max = Math.max(max , count);
            }
            else{
                count = 0;
            }
        }
        return max;
        // for (int i =0 ; i<l ; i++){
        //     int c = 0;
        //     for (int j =i ; j<l ;j++){
        //         if(nums[j] == 1){
        //             c++;
        //             max = Math.max(max , c);
        //         }
        //         else{
        //              break;
        //         } 
        //     }
        // }
        //  return max;
    } 
    
}