class Solution {
    public int[] twoSum(int[] nums, int target) {
    //  int ans[]=new int[2];
     int l=nums.length;
    //  for(int i=0;i<l;i++){
    //     for(int j=i+1;j<l;j++){
    //         if((nums[i]+nums[j])==target){
    //             ans[0]=i;
    //             ans[1]=j;
    //         }
    //     }
    //  }
    //  return ans;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<l;i++){
                 int diff = target - nums[i];
            if(map.containsKey(diff)){

                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
