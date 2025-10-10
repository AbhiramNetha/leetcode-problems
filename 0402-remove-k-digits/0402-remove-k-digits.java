class Solution {
    public String removeKdigits(String num, int k) {
        // int m = num.length();
        // Stack<Character> st = new Stack<>();
        // for(char dig:num.toCharArray()){
        //     while(!st.isEmpty() && k>0 &&  st.peek() > dig){
        //         st.pop();
        //         k--;
        //     }
        //     st.push(dig);
        // }
        // if(k>0 && !st.isEmpty()){
        //     st.pop();
        //     k--;
        // }
        // StringBuilder sb = new StringBuilder();
        // // if(st.isEmpty()) return "0";
        // while(!st.isEmpty()){
        //     sb.append(st.pop());
        // }
        // sb.reverse();
        // while (sb.length() > 0 && sb.charAt(0) == '0') {
        //     sb.deleteCharAt(0);
        // }
        
        // return sb.length()>0?sb.toString():"0";
        Stack<Character> stack = new Stack<>();
        
        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        // Remove remaining k digits from the end of the stack
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        
        // Construct the resulting string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse(); // Reverse to get the correct order
        
        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        // Handle edge case where result might be empty
        return sb.length() > 0 ? sb.toString() : "0";
    }
}