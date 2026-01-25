class Solution {
    public boolean isAnagram(String s, String t) {
        HashSet<Character> hs= new HashSet<>();
        HashSet<Character> hs1= new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            hs1.add(ch);
            if(!hs.contains(ch)){
                return false;
            } 
        }
        if((hs.size() != hs1.size()) || s.length() != t.length()) return false;
        return true;
    }
}