class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int ele:hm.keySet()){
            if(hm.get(ele) > n/2){
                return ele;
            }
        }
        return 0;
    }
}