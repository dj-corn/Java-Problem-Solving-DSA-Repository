class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if((9<nums[i] && nums[i]<100) || (999<nums[i] && nums[i]<10000) || (99999<nums[i] && nums[i]<1000000)) count++;

                    // 1-     9     odd
                    // 10-    99    even  9<n<100
                    // 100-   999   odd
                    // 1000-  9999  even  999<n<10000
                    // 10000- 99999 odd
                    // 100000-999999 even  999
        }
        return count;
    }
}
