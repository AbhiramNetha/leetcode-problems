class Solution {
    public int findmax(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public int isintime(int[] arr, int k){
        int n = arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
            ans += (arr[i] +k-1)/k;
        }
        return ans; 
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l=1;
        int r = findmax(piles);
        int res =r;
        while(l<=r){
            int mid = l+(r-l)/2;
            int func = isintime(piles,mid);
            if(func <= h){
                res = mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
}