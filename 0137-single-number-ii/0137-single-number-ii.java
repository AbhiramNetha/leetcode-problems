class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans =0;
        for(int num:hm.keySet()){
            if(hm.get(num) == 1){
                ans = num;
                break;
            }
        }
        return ans;
    }
}