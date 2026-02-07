class Solution {
    // public void swap(int i,int j,int[] arr){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    // public void fun(int ind,int[] arr,List<List<Integer>> ans){
    //     if(ind==arr.length){
    //         ArrayList<Integer> list = new ArrayList<>();
    //         for(int i=0;i<arr.length;i++){
    //             list.add(arr[i]);
    //         }
    //         ans.add(new ArrayList<>(list));
    //         return;
    //     }
    //     for(int i=ind;i<arr.length;i++){
    //         swap(i,ind,arr);
    //         fun(ind+1,arr,ans);
    //         swap(i,ind,arr);
    //     }
    // }
    public void fun(int[] arr,boolean[] freq,List<Integer> list,List<List<Integer>> ans){
        if(arr.length == list.size()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(arr[i]);
                fun(arr,freq,list,ans);
                list.remove(list.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        fun(nums,freq,list,ans);
        return ans;
    }
}