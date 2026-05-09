class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int drop =0;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                drop++;
            }
            if(drop>1) return false;
        }
        return true;





        // int n = nums.length;
        // int cnth =0;
        // int lastind = 0;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i] > nums[i+1]){
        //         cnth++;
        //         if(cnth > 1) return false;
        //         lastind = i+1;
        //     }
        // }
        // int scd =0;
        // for(int i= lastind;i<n-1;i++){
        //     int frst= nums[i];
        //     scd = nums[i+1];
        //     if(frst == scd) continue;
        //     if(scd < frst) return false;
        //     System.out.println( i + " " + (i+1));
        // }

        // for(int i=0;i<lastind;i++){
        //     int frst = scd;
        //     int nxt = nums[i];
        //     if(frst > nxt) return false;
        //     if(frst == nxt) continue;
        //     System.out.println( i + " " + (i+1));
        // }
        // return true;
    }
}