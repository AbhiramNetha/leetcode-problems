class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    hs.add(nums1[i]);
                }
            }
        }
        int n = hs.size();
        int[] ans = new int[n];
        int i=0;
        for(int res :hs){
            ans[i] = res;
            i++;
        }
        return ans;
    }
}