class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int iteration = nums.length;
            int max =-1;
            for(int j=0;j<nums.length;j++){
                int k=i;
                while(iteration>0){
                    if(nums[k%nums.length]>nums[i]){
                        max = nums[k%nums.length];
                        break;
                    }
                    k++;
                    iteration--;
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}