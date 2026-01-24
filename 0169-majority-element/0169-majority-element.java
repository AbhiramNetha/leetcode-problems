class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majority = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            majority.put(nums[i],majority.getOrDefault(nums[i],0)+1);
        }
        for(int abhi:majority.keySet()){
            int m = n/2;
            if(majority.get(abhi)>m){
                ans = abhi;
            }
        }
        return ans;
    }
}