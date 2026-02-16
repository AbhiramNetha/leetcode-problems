class Solution {
    public void swap(int arr1[],int[] arr2, int l, int r){
        if(arr1[l] > arr2[r]){
            int temp =arr1[l];
            arr1[l] = arr2[r];
            arr2[r] = temp;
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = n+m;
        int gap = (len/2) + (len%2);
        while(gap>0){
            int left = 0;
            int right = left+gap;
            while(right<len){
                if(left<m && right>=m){
                    swap(nums1,nums2,left,right-n);
                }
                else if(left>=m){
                    swap(nums2,nums2,left-m,right-m);
                }
                else{
                    swap(nums1,nums1,left,right);
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap = (gap/2) + (gap%2);
        } 
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }   
    }
}