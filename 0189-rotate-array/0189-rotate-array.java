class Solution {
    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int nind = (i+k)%nums.length;
            nums[nind] = res[i];
        }
        

        // int n =nums.length;
        
        // k = k%n;
        // int[] left = new int[k];
        // int[] right = new int[n-k];
        // for(int i=0;i<k;i++){
        //     left[i] = nums[i];
        // }
        // for(int i=k;i<(n-k);i++){
        //     left[i] = nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     if(i>k){
        //         nums[i] = right[i];
        //     }
        //     else{
        //         nums[i]=left[i];
        //     }
        // }


    //     int n = nums.length;
    //     k%=n;
    //     reverse(nums,0,n-1);
    //     reverse(nums,0,k-1);
    //     reverse(nums,k,n-1);
    // }
    }
    // private void reverse(int[] nums,int l,int r){
    //     while(l<r){
    //         int temp = nums[l];
    //         nums[l] = nums[r];
    //         nums[r] = temp;
    //         l++;
    //         r--;
    //     }
    // }
}