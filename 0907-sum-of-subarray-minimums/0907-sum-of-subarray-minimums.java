class Solution {
    public int[] findpse(int[] arr){
        Stack<Integer> st1 = new Stack<>();
        int n =arr.length;
        int[] psee = new int[n];
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && arr[st1.peek()] > arr[i]){
                st1.pop();
            }
            psee[i] = st1.isEmpty() ? -1: st1.peek();
            st1.push(i);
        }
        return psee;
    }
    public int[] findnse(int[] arr){
        Stack<Integer> st2 = new Stack<>();
        int n =arr.length;
        int[] nse = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && arr[st2.peek()] >= arr[i]){
                st2.pop();
            }
            nse[i] = st2.isEmpty() ? n: st2.peek();
            st2.push(i);
        }
        return nse;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int)(1e9 + 7);
        int total = 0;
        int[] psee = findpse(arr);
        int[] nse = findnse(arr);
        for(int i=0;i<n;i++){
            int left = i- psee[i];
            int right = nse[i] - i;
            total = (total + (left*right*arr[i])%mod)%mod;
        }
        return total;
    }
}