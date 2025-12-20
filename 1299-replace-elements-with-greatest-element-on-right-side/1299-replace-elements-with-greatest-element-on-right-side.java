class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[n-1] = -1;
        int maxi = arr[n-1];
        for(int i=n-2;i>=0;i--){
            int temp = arr[i];
            ans[i] = maxi;
            maxi = Math.max(maxi,temp);
        }
        return ans;
    }
}