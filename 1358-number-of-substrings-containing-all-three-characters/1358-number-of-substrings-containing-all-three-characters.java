class Solution {
    public int numberOfSubstrings(String s) {
       int n = s.length();
       int l=0;
       int ans =0;
       HashMap<Character,Integer> hm = new HashMap<>();
       for(int r=0;r<n;r++){
        char ch = s.charAt(r);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        while(hm.size()==3){
            char c = s.charAt(l);
            ans+=(n-r);
            if(hm.get(c) > 1){
                hm.put(c,hm.get(c)-1);
            }
            else{
                hm.remove(c);
            }
            l++;
        }
       }
       return ans;
    }
}