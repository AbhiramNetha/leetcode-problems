class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int sum =0;
        int cnt =0;
        for(int i=0;i<n;i++){
            sum+= nums[i];
        }
        while(sum % k !=0){
            sum-=1;
            cnt+=1;
            if(sum%k == 0){
                return cnt;
            }
        }
        return cnt;
    }
}