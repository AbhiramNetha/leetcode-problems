class Solution {
    public int differenceOfSum(int[] nums) {
        int sum =0;
        int digsum=0;
        for(int i=0;i<nums.length;i++){
            int dig = nums[i];
            while(dig>0){
                int rem = dig%10;
                digsum+=rem;
                dig=dig/10;
            }
            sum+=nums[i];
        }
        return sum-digsum;
    }
}