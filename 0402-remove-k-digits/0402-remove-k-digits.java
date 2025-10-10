class Solution {
    public String removeKdigits(String num, int k) {
        int m = num.length();
        Stack<Character> st = new Stack<>();
        for(char dig:num.toCharArray()){
            while(!st.isEmpty() && k>0 &&  st.peek() > dig){
                st.pop();
                k--;
            }
            st.push(dig);
        }
        if(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        // if(st.isEmpty()) return "0";
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length()>0?sb.toString():"0";
    }
}