class Solution { 
    public int firstStableIndex(int[] nums, int k) { 
        int n = nums.length;
        if (n == 0) return -1;
        int[] index = new int[n];
        index[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            index[i] = Math.min(nums[i], index[i + 1]);
        }
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            int min = index[i];

            if (max - min <= k) {
                return i;
            }
        }
        return -1;
    } 
}
