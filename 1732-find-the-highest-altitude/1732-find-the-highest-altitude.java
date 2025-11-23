class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        // int[] ans = new int[gain.length+1];
        // ans[0] = 0;
        int j =1;
        int maxi = 0;
        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            // ans[j] = sum;
            maxi = Math.max(maxi,sum);
            j++;
        }
        return maxi;
    }
}