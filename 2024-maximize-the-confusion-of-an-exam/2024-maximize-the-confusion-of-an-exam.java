class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n = answerKey.length();
        int l=0;
        int ans =0;
        int cnt1=0;
        int cnt2=0;
        for(int r=0;r<n;r++){
            if(answerKey.charAt(r)=='T') cnt1++;
            if(answerKey.charAt(r)=='F') cnt2++;
            while(Math.min(cnt1,cnt2)>k){
                if(answerKey.charAt(l)=='T'){
                    cnt1--;
                }
                else{
                    cnt2--;
                }
                l++;   
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}