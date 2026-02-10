class Solution {
    // public int findele(int r,int c){
    //     int res = 1;
    //     if(c==0 || c==r) return 1;
    //     for(int i=0;i<c;i++){
    //         res *= (r-i);
    //         res/= (c+1);
    //     }
    //     return res;
    // }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans =1;
        list.add(1);
        for(int i=0;i<rowIndex;i++){
            ans = ans*(rowIndex-i);
            ans = ans/(i+1);
            list.add((int)ans);
        }
        return list;
    }
}