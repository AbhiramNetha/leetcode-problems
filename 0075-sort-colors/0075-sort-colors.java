class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                cnt0++;
            }
            else if(nums[i] == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            nums[i] = 0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            nums[i] = 1;
            System.out.println(nums[i]+ " " + i);
        }
        System.out.println(" ------------- ");
        for(int i=cnt0+ cnt1;i<cnt1+cnt0+cnt2;i++){
            nums[i] =2;
            System.out.println(nums[i]+ " " + i);
        }
    }
}