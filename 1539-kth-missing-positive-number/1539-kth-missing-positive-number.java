class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int cnt =0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int j=0;
        int rem = k;
        for(int i=1;i<=maxi;i++){
            if(arr[j] != i){
                cnt++;
                rem--;
            }
            else{
                j++;
            }
            if(cnt == k) return i;
        }
        if(rem>0) return arr[n-1]+rem;
        if(cnt ==0) return n+k;
        return 0;
    }
}