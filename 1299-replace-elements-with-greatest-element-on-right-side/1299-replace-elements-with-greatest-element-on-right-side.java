class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            ans[i] = st.peek();
            if(st.peek() < arr[i]){
                st.push(arr[i]);
            }
        }
        return ans;
    }
}