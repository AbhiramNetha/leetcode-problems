class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int number:hm.keySet()){
            if(hm.get(number) > n/3){
                list.add(number);
            }
        }
        return list;
    }
}