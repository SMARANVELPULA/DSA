class Solution {
    public boolean containsDuplicate(int[] nums) {
         int len = nums.length;
        // for (int i=0;i<=len -1 ; i++){
        //     for (int j=i+1 ; j<=len -1 ; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        HashSet<Integer> s= new HashSet<>();
        for(int i=0;i<len;i++){
            s.add(nums[i]);
        }
        if(s.size()!= len){
            return true;
        }
        return false;
    } 
}