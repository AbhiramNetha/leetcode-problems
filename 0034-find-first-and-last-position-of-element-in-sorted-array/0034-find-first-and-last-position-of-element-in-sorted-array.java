class Solution {
    public int left(int[] nums,int t){
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]>=t){
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(l >= nums.length){
            return -1;
        }
        if(nums[l] != t){
            return -1;
        }
        else{
            return l;
        }
    }
    public int right(int[] nums,int t){
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l +(r-l)/2;
            if(nums[mid]>t){
                r = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]!=t){
            return -1;
        }
        else{
            return r;
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int lm = left(nums,target);
        int rm = right(nums,target);
        int ans[] = {lm,rm};
        return ans;
    }
}