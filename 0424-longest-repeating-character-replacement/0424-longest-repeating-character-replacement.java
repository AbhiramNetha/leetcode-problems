class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int hash[] =new int[26];
        int maxlen =0;
        int maxf =0;
        int ans =0;
        int l =0;
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            maxf = Math.max(maxf,++hash[ch-'A']);
            if((r-l+1) - maxf > k){
                char c = s.charAt(l);
                hash[c-'A']--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}