class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xor =0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
            xor^=(i+1);
        }
        int bitno =0;
        while(true){
            if((xor & 1<<bitno) !=0){
                break;
            }
            bitno++;
        }
        int zero =0;
        int one =0;
        for(int i=0;i<n;i++){
            if((nums[i] & 1<<bitno) !=0 ){
                one^=nums[i];
            }
            else{
                zero^=nums[i];
            }
        }
        for(int i=1;i<=n;i++){
            if((i & 1<<bitno) !=0 ){
                one^=i;
            }
            else{
                zero^=i;
            }
        }
        int cnt =0;
        for(int i=0;i<n;i++){
            if(zero == nums[i]) cnt++;
        }
        if(cnt == 2){
            return new int[]{zero,one};
        }
        else{
            return new int[]{one,zero};
        }
    }
}