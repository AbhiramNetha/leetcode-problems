class Solution {
    public void fun(int ind,int[] arr,List<Integer> list,List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            fun(i+1,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,nums,list,ans);
        return ans;
    }
}