class Solution {
    public int smallestIndex(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum =0;
            int n = nums[i];
            while(n!=0){
                int rem = n%10;
                sum+= rem;
                n=n/10;
            }
            if(sum==i){
                ans = Math.min(ans,sum);
            }
        }
        return (ans == Integer.MAX_VALUE)?-1:ans;
    }
}