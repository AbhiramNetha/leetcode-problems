class Solution {
    public int lsum(int ind,int[] arr){
        if(ind == 0) return 0;
        int sum =0;
        for(int i=ind-1;i>=0;i--){
            sum+=arr[i];
        }
        return sum;
    }
    public int rsum(int ind,int[] arr){
        int n = arr.length;
        int sum =0;
        if(ind == n-1) return 0;
        for(int i=ind+1;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int findMiddleIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.print(i + " ");
            int leftsum = lsum(i,nums);
            System.out.print(leftsum + " ");
            int rightsum = rsum(i,nums);
            System.out.println(rightsum + " ");
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}