class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        
        if(n==0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int longest = 1;
        for(int i=0;i<n;i++){
            if(!hs.contains(nums[i]-1)){
                int cnt =1;
                int x = nums[i];
                hs.remove(nums[i]);
                while(hs.contains(++x)){
                    cnt=cnt+1;
                    hs.remove(x);
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}