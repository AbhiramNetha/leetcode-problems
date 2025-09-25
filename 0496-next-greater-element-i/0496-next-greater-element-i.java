// class Solution {
//     // public int nge(int[] nums2,int val){

//     // }
//     public int findind(int[] arr,int val){
//         int index = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == val){
//                 index =i;
//                 break;
//             }
//         }
//         return index;
//     }
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         // Stack<Integer> st = new Stack<>();
//         // for(int i= )
//         int[] nge = new int[nums1.length];
//         for(int i=0;i<nums1.length;i++){
//             int ind = findind(nums2,nums1[i]);
//             if(ind == nums2.length-1){
//                 nge[i] = -1;
//                 break;
//             }
//             for(int j=ind+1;j<nums2.length;j++){
//                 if(nums1[i] < nums2[j]){
//                     nge[i] = nums2[j];
//                     break;
//                 }
//                 if(nums1[i] > nums2[j] && j==nums2.length){
//                     nge[i] = -1;
//                     break;
//                 }
//             }
//         }
//         return nge;
//     }
// }
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--) {
            while(!st.empty() && st.peek()<=nums2[i]) st.pop();
            if(st.empty()) mpp.put(nums2[i],-1);
            else mpp.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) ans[i]=mpp.get(nums1[i]);
        return ans;
    }
}