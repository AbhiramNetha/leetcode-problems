class Solution {
    public void fun(int i,int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        fun(i+1,nums,list,ans);
        list.remove(list.size()-1);
        fun(i+1,nums,list,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fun(0,nums,list,ans);
        return ans;
    }
}