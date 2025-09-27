class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int m = n;
        int sum =0;
        int i=0;
        int ans=0;
        while(m>=0){
            sum=0;
            for(int j=i;j<n;j++){
                int len = j-i+1;
                sum+=arr[j];
                if(len%2 == 1){
                    ans+=sum;
                }
            }
            i++;
            m--;
        }
        return ans;
    }
}