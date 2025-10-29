class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int count =0;
        int sum = 0;
        for(int i=cost.length-1;i>=0;i--){
            if(count == 2){
                count = 0;
            }
            else{
                
                sum+=cost[i];
                count++;
                
                
            }
        }
        return sum;
    }
}