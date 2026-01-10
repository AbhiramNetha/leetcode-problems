class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        leftsum[0] = 0;
        rightsum[n-1] =0;
        int lsum =0;
        int rsum =0;
        for(int i=1;i<n;i++){
            lsum += nums[i-1];
            leftsum[i] = lsum;
        }
        for(int i=n-2;i>=0;i--){
            rsum+= nums[i+1];
            rightsum[i] = rsum;
        }
        for(int i=0;i<n;i++){
            if(leftsum[i] == rightsum[i]){
                return i;
            }
        }
        return -1;
    }
}