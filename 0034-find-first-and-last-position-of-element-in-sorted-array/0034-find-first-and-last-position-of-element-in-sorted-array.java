class Solution {
    public int lm(int[] arr, int k){
        int l=0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]>=k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l>=arr.length || (arr[l]!=k)) return -1;
        return l;
    }
    public int rm(int[] arr, int k){
        int l=0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]>k){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(r<0 || (arr[r] !=k)) return -1;
        return r;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = lm(nums,target);
        int right = rm(nums,target);
        return new int[]{left,right};
    }
}