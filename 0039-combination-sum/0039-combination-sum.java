class Solution {
    public void fun(int i,int[] arr,int t,List<Integer> list,List<List<Integer>> ans)
    {
        if(i==arr.length){
            if(t==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=t){
            list.add(arr[i]);
            fun(i,arr,t-arr[i],list,ans);
            list.remove(list.size()-1);
        }
        fun(i+1,arr,t,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}