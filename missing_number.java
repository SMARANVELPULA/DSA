class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i=1;i<=nums.length;i++){
            xor^=i;
            xor^=nums[i-1];
        }
        return xor;
    }
    // public int missingNumber(int[] nums) {
    //     boolean f = false;
    //     int idx=-1;
    //     int len = nums.length;
    //     for (int i=0;i<=len;i++){
    //         f = false;
    //         for (int j=0;j<len;j++){
    //             if(i == nums[j]){
    //                 f = true;
    //                 break;
    //             }
    //         }
    //         if(!f) return i;
    //     }
    //     return -1;
    // }
}
