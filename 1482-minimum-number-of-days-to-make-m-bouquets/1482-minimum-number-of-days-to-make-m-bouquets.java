class Solution {
    public int maxim(int[] arr){
        int n = arr.length;
        int maxi =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public int minim(int[] arr){
        int n = arr.length;
        int mini =Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,arr[i]);
        }
        return mini;
    }
    public boolean ispossible(int[] arr,int m, int k, int mid){
        int n = arr.length;
        int cnt =0;
        int noboq=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=mid){
                cnt++;
            }
            else{
                noboq += (cnt/k);
                cnt =0;
            }
        }
        noboq += (cnt/k);
        if(noboq >= m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int l=minim(bloomDay);
        int r=maxim(bloomDay);
        int ans =-1;
        if(m*k > n) return -1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(ispossible(bloomDay,m,k,mid)){
                ans = mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}