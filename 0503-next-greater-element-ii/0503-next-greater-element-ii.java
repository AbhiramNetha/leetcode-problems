class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max =-1;
            for(int j=i+1;j<=i+nums.length-1;j++){
                if(nums[(j)%nums.length]>nums[i]){
                    max = nums[(j)%nums.length];
                    break;     
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}