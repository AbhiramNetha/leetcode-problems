class Solution {
    public int[] findpse(int[] nums){
        int n = nums.length;
        Stack<Integer> st1 = new Stack<>();
        int[] pse = new int[n];
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && nums[st1.peek()] > nums[i]){
                st1.pop();
            }
            pse[i] = st1.isEmpty() ? -1 : st1.peek();
            st1.push(i);
        }
        return pse;
    }
    public int[] findnse(int[] nums){
        int n = nums.length;
        Stack<Integer> st2 = new Stack<>();
        int[] nse = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && nums[st2.peek()] >= nums[i]){
                st2.pop();
            }
            nse[i] = st2.isEmpty() ? n : st2.peek();
            st2.push(i);
        }
        return nse;
    }
    public int[] findple(int[] nums){
        int n = nums.length;
        Stack<Integer> st3 = new Stack<>();
        int[] ple = new int[n];
        for(int i=0;i<n;i++){
            while(!st3.isEmpty() && nums[st3.peek()] < nums[i]){
                st3.pop();
            }
            ple[i] = st3.isEmpty() ? -1 : st3.peek();
            st3.push(i);
        }
        return ple;
    }
    public int[] findnle(int[] nums){
        int n = nums.length;
        Stack<Integer> st4 = new Stack<>();
        int[] nle = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st4.isEmpty() && nums[st4.peek()] <= nums[i]){
                st4.pop();
            }
            nle[i] = st4.isEmpty() ? n : st4.peek();
            st4.push(i);
        }
        return nle;
    }
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int mod = (int)(1e9 + 7);
        int largest = 0;
        int smallest = 0;
        int[] pse = findpse(nums);
        int[] nse = findnse(nums);
        int[] pge = findple(nums);
        int[] nge = findnle(nums);
        for(int i=0;i<n;i++) {
            largest+=(long)(i-pge[i])*(nge[i]-i)*nums[i];
            smallest+=(long)(i-pse[i])*(nse[i]-i)*nums[i];
        }
        return largest-smallest;
    }
}