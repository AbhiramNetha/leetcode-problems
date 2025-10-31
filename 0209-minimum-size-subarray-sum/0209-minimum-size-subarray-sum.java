class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int l=0;
        int temp = 0;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            while(temp>=target){
                ans = Math.min(ans,r-l+1);
                temp-=nums[l];
                l++;
            }

            // ans = Math.min(ans,r-l+1);
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}