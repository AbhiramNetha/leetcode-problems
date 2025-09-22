class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k == 0) return 0;
        int cnt=0;
        while(true){
            sum-=1;
            cnt++;
            if(sum%k == 0) return cnt;
        }
        // return 0;
    }
}