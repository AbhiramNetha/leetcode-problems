class Solution {
    public boolean isPossible(int[] arr, int thres,int div){
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += (arr[i] + div - 1) / div;
            if(ans>thres) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int l =1;
        int r = 1000000000;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(isPossible(nums,threshold,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}