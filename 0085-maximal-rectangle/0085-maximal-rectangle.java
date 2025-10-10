class Solution {
    public int largesthist(int[] arr){
        int n = arr.length;
        int pse =0;
        int nse =0;
        int maxi = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                int ele = arr[st.pop()];
                pse = st.isEmpty()?-1:st.peek();
                nse = i;
                maxi = Math.max(maxi,ele *(nse-pse-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            nse = n;
            int ele = arr[st.pop()];
            pse = st.isEmpty()?-1:st.peek();
            maxi = Math.max(maxi,ele*(nse-pse-1));
        }
        return maxi;
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int[][] prefix = new int[n][m];
        
        for(int j=0;j<m;j++){
            int sum =0;
            for(int i=0;i<n;i++){
                int num = Character.getNumericValue(matrix[i][j]);
                sum+= num;
                if(num == 0){
                    sum =0;
                }
                prefix[i][j] = sum;
            }
        }
        int maxim =0;
        for(int i=0;i<n;i++){
            maxim= Math.max(maxim,largesthist(prefix[i]));
        }
        return maxim;

    }
}