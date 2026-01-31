class Solution {
    public void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void fun(int ind,int[] arr,List<List<Integer>> ans){
        if(ind==arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                list.add(arr[i]);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            swap(i,ind,arr);
            fun(ind+1,arr,ans);
            swap(i,ind,arr);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,nums,ans);
        return ans;
    }
}