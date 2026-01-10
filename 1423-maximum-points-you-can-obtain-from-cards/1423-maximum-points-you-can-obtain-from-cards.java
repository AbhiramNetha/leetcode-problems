class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum =0;
        int rsum =0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int sum= lsum;
        int ridx = n-1;
        for(int i=k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[ridx];
            ridx--;
            sum = Math.max(sum,lsum+rsum);
        }
        return sum;
    }
}