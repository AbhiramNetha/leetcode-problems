class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        HashMap<Character,Character> pm = new HashMap<>();
        Boolean ans = true;
        for(int i=0;i<s.length();i++){
            char val = s.charAt(i);
            char bal = t.charAt(i);
            
            if(!hm.containsKey(val) && !pm.containsKey(bal)){
                hm.put(val,bal);
                pm.put(bal,val);
            }
            else if(hm.containsKey(val) && hm.get(val)!=bal){
                ans = false;
                break;
            }
            else if(pm.containsKey(bal) && pm.get(bal) != val){
                ans = false;
                break;
            }
        }
        return ans;
    }
}