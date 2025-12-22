class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n  = nums.length;
        int ans =0;
        for(int i=0;i<n;i++){
            int num = nums[i];
            for(int j=i+1;j<n;j++){
                if(num == nums[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}