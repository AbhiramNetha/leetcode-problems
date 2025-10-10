class Solution {
    public int[] findpse(int[] arr){
        int n = arr.length;
        int[] psee = new int[n];
        Stack<Integer> st1 = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]){
                st1.pop();
            }
            psee[i] = st1.isEmpty()? -1:st1.peek();
            st1.push(i);
        }
        return psee;
    }
    public int[] findnse(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nsee = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            nsee[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nsee;

    }
    public int largestRectangleArea(int[] heights) {
        int[] pse = findpse(heights);
        int[] nse = findnse(heights);
        int maxi=0;
        for(int i=0;i<heights.length;i++){
            maxi = Math.max(maxi,(heights[i]*(nse[i]-pse[i]-1)));
        }
        return maxi;
    }
}