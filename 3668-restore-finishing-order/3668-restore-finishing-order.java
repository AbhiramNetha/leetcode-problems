class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<friends.length;i++){
            hs.add(friends[i]);
        }
        int j=0;
        for(int i=0;i<order.length;i++){
            if(hs.contains(order[i])){
                ans[j] = order[i];
                j++;
            }
        }
        return ans;
    }
}