class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] even = new int[n/2];
        int[] odd = new int[n/2];
        int p=0;
        int q=0;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                even[p] = nums[i];
                p++;
            }
            else{
                odd[q] = nums[i];
                q++;
            }
        }
        int s=0;
        for(int i=0;i<n;i+=2){
            ans[i] = even[s];
            ans[i+1]= odd[s];
            s++;
        }
        return ans;
    }
}