class Solution {
    // public int findmax(int[] nums,int i , int j){
    //     int res = Integer.MIN_VALUE;
    //     for(int k=i;k<=j;k++){
    //         res = Math.max(res,nums[k]);
    //     }
    //     return res;
    // }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(n==0 || k==0) return new int[0];
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        int j =0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i] ){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                ans[j] = nums[dq.peekFirst()];
                j++;
            }
            
        }
        return ans;










        // int n = nums.length;
        // if(n == 1 || k>n){
        //     return nums;
        // }
        // int[] ans = new int[n-k+1];
        // for(int i=0;i<n-k+1;i++){
        //     ans[i] = findmax(nums,i,i+k-1);
        // }
        // return ans;





        // int n = nums.length;
        // if(k==1) return nums;
        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> res = new Stack<>();
        // int l=0;
        // for(int r=0;r<n;r++){
        //     if(r-l==k){
        //         l++;
        //     }
        //     st.push(nums[r]);
        //     if(r-l+1 == k){
        //         int ans =0;
        //         int ele = st.pop();
        //         while(!st.isEmpty()){
        //             if(st.peek()<ele){
        //                 ans = ele;
        //                 ele = ans;
        //             }
        //             else{
        //                 ans = st.peek();
        //                 ele = ans;
        //             }
        //             st.pop();
        //         }
        //         res.push(ans);
        //     }
        // }
        // int[] result = new int[res.size()];
        // for(int i= res.size()-1;i>=0;i--){
        //     result[i] = res.pop();
        // }
        // return result;


        // int n = nums.length;
        // if(k==1) return nums;
        // Stack<Integer> st = new Stack<>();
        // for(int i=0;i<n-k+1;i++){
        //     int maxi= nums[i];
        //     for(int j=i;j<i+k;j++){
        //         maxi = Math.max(maxi,nums[j]);
        //     }
        //     st.push(maxi);
        // }
        // int[] ans = new int[st.size()];
        // for(int i=st.size()-1;i>=0;i--){
        //     ans[i] = st.pop();
        // }
        // return ans;
    }
}