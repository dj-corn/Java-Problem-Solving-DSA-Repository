class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int r = target - nums[i];
            if(ans.containsKey(r)){
                return new int []{ans.get(r),i};
            }else{
                ans.put(nums[i],i);
            }
        }
        return new int[]{-1,1};
    }
}