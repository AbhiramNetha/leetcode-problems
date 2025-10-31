class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n =fruits.length;
        int l=0;
        int ans =0;
        int k=2;
        for(int r=0;r<n;r++){
            int val=fruits[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>k){
                int val2=fruits[l];
                if(hm.get(val2) > 1){
                    hm.put(val2,hm.get(val2)-1);
                    l++;
                }
                else{
                    hm.remove(val2);
                    l++;
                }
            }
            ans =Math.max(ans,r-l+1);
        }
        return ans;
    }
}