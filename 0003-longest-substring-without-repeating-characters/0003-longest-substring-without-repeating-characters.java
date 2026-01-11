class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans =0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int l=0;
        for(int r=0;r<n;r++){
            char ch = s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            while(hm.get(ch) > 1){
                if(s.charAt(l) == ch){
                    hm.put(ch,hm.get(ch)-1);
                }
                else{
                    if(hm.get(s.charAt(l)) == 1){
                        hm.remove(s.charAt(l));
                    }
                }
                l++;
            }
            System.out.println( r + " " + (r-l+1));
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}