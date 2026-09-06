class Solution {
    public int countGoodRotations(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            arr.add(nums[i]);
        }
        int count = 0;
        int j = n/2;
        long fsum = 0;
        long lsum = 0;
        for(int i=0; i<n/2; i++){
            fsum += nums[i];
            lsum += nums[j];
            j++;
        }
        if(fsum > lsum)count++;
        j = n/2;
        for(int i=0; i<n-1; i++){
            fsum -= arr.get(0);
            fsum += arr.get(j);
            lsum -= arr.get(j);
            lsum += arr.get(0);
            arr.add(arr.remove(0));
            if(fsum > lsum) count++;
        }
        return count;
    }
}