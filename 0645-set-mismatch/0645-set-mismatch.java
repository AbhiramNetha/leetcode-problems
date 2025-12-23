class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int dup = 0;
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                dup = nums[i];
            }
        }
        int mis = 0;
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                mis = i;
            }
        }
        
        return new int[]{dup,mis};
    }
}