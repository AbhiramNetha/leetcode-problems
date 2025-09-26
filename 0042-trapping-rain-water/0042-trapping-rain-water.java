class Solution {
    public int trap(int[] height) {
        // int ans =0;
        // int res =0;
        // int n = height.length;
        // int leftmax = height[0];
        // for(int i=1;i<n;i++){
        //     if(leftmax<height[i]){
        //         leftmax = height[i];
        //     }
        //     else if(leftmax > height[i]){
        //         int len = n;
        //         ans =0;
        //         while(leftmax>=height[i] && len-i !=0){
        //             ans += (leftmax-height[i]);
        //             len--;
        //         }
        //         if(len!=0){
        //             res =ans;
        //         }
        //     }
        // }
        // return res;

        // The formulae to find the rain water logged in between two height are : min(leftmax,rightmax) - height[i]; 
        // InOrder to fing that we need prefix sum and also suffix sum, so by using these , we can get the water logged in between the poles

        //Finding the prefix sum
        int n = height.length;
        int[] prefix = new int[n];
        prefix[0] = height[0];
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }
        //Finding the suffix sum
        int[] suffix = new int[n];
        suffix[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = Math.max(suffix[i+1],height[i]);
        }

        int ans =0;
        for(int i=0;i<n;i++){
            if(prefix[i] > height[i] && suffix[i] > height[i]){
                ans += Math.min(prefix[i] , suffix[i]) - height[i];
            }
        }
        return ans;
    }
}