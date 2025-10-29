class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int n = nums.length;
        int minsum =Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            if(r-l == k){
                
                l++;
            }
            if(r-l+1 == k){
                minsum = Math.min(minsum,nums[r] - nums[l]);
            }

        }
        return minsum;
    }
}