class Solution {
    public int maxSubArray(int[] nums) {
        int l=0;
        int n=nums.length;
        int sum =0;
        int ans = Integer.MIN_VALUE;
        // int maxsum = 0;
        for(int r=0;r<n;r++){
            sum += nums[r];
            if(sum >  ans ){
                ans = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }
        return ans;
    }
}