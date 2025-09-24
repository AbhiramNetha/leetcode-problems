class Solution {
    // public int nge(int[] nums2,int val){

    // }
    public int findind(int[] arr,int val){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == val){
                index =i;
                break;
            }
        }
        return index;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Stack<Integer> st = new Stack<>();
        // for(int i= )
        int[] nge = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int ind = findind(nums2,nums1[i]);
            if(ind == nums2.length-1){
                nge[i] = -1;
                break;
            }
            for(int j=ind;j<nums2.length;j++){
                if(j+1 == nums2.length && nums1[i] > nums2[j]){
                    nge[i] = -1;
                    break;
                }
                if(nums1[i] < nums2[j]){
                    nge[i] = nums2[j];
                    break;
                }
            }
        }
        return nge;
    }
}