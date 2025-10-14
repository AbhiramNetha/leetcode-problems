class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int ans =0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ')' && !st.isEmpty()){
                st.pop();
            }
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                ans = Math.max(ans,st.size());
            }
        }
        return ans;
    }
}