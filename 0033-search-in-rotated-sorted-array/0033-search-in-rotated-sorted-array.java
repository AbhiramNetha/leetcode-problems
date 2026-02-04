class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int r= n-1;
        int ans = -1;
        // Arrays.sort(nums);
        System.out.println(nums[0]);
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target<=nums[mid]){
                    r= mid-1;
                }
                else{
                    l= mid+1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[r]){
                    r= mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return -1;
    }
}