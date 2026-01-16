class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt =0;
        int sum =0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int temp = sum-k;
            if(hm.containsKey(temp)){
                cnt+= hm.get(temp);
            }
            if(hm.containsKey(sum)){
                hm.put(sum,hm.get(sum)+1);
            }
            else{
                hm.put(sum,1);
            }


        }
        return cnt;
    }
}