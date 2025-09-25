class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i =nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }
            else if(nums2[i]<st.peek()){
                hm.put(nums2[i],st.peek());
            }
            else{
                while(!st.isEmpty() && nums2[i] >= st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    hm.put(nums2[i],st.peek());
                }
                else{
                    hm.put(nums2[i],-1);
                }
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i] = hm.get(nums1[i]);
        }
        return ans;
    }
}
