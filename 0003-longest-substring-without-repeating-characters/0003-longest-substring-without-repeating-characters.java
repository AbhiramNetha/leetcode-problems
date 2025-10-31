class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0;
        int ans =0;
        HashSet<Character> hs = new HashSet<>();
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            while(hs.contains(ch)){
                char ch1 = s.charAt(l);
                if(ch == ch1){
                    hs.remove(ch1);
                }
                l++;
            }
            hs.add(ch);
            ans =Math.max(ans,r-l+1);
        }
        return ans;
    }
}