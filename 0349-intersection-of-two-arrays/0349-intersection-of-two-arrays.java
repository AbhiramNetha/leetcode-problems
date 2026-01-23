class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums1){
            hs.add(num);
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int nums:nums2){
            if(hs.contains(nums)){
                ans.add(nums);
            }
        }
        int[] arr = new int[ans.size()];
        int i=0;
        for(int ele:ans){
            arr[i] = ele;
            i++;
        }
        return arr;
    }
}