class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> hm = new HashMap<>();
        char ch1 = 97;
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch,ch1);
                ch1++;
            }
        }
        int n = message.length();
        String s = "";
        for(int i=0;i<n;i++){
            char c = message.charAt(i);
            if(c != ' '){
                s+= hm.get(c);
            }
            else{
                s+=' ';
            }
        }
        return s;
    }
}