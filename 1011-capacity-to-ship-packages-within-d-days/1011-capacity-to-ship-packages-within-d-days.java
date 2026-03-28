class Solution {
    public int maxele(int[] arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public int sumele(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public boolean isPossible(int[] arr,int d,int cap){
        int n = arr.length;
        int load =0;
        int day=1;
        for(int i=0;i<n;i++){
            if(load + arr[i] > cap){
                day++;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
            if(day > d) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int l =maxele(weights);
        int r = sumele(weights);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(isPossible(weights,days,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}