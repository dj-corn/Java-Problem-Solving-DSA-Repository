class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int[] index = new int[nums.length];
        int i = 0;
        while(i<nums.length){
            int min = Integer.MAX_VALUE;
            max = Math.max(max,nums[i]);
            for(int j=i; j<nums.length; j++){
                min = Math.min(min, nums[j]);
            }
            index[i] = max - min;
            System.out.print(min);
            i++;
        }
        for(int j=0; j<nums.length; j++){
            if(index[j] <= k){
                return j;
            }
        }
        return -1;

    }
}