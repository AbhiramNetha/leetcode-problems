class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans =0;
        int n = nums.length;
        int l=0;
        double sum =0;
        double avg =0;
        double maxim =Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            sum += nums[r];
            if(r-l == k){
                sum-= nums[l];
                l++;
            }
            if(r-l+1 == k){
                avg = sum/k;
                maxim = Math.max(maxim,avg);
            }
        }
        return maxim;
    }
}