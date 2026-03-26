class Solution {
    public boolean isintime(int[] arr,int h, int k){
        int n = arr.length;
        int ans =0;
        for(int i=0;i<n;i++){
            ans += (arr[i] +k-1)/k;
        }
        if(ans <= h) return true;
        return false; 
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l=1;
        int r = 1000000000;
        while(l<=r){
            int mid = l+(r-l)/2;
            // int func = isintime(piles,mid);
            if(isintime(piles,h,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}