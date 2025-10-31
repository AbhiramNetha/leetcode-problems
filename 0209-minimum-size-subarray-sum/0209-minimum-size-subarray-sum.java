class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int l=0;
        int sum =0;
        int n = nums.length;
        for(int r=0;r<n;r++){
            sum += nums[r];
            while(sum>= target){
                ans = Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}