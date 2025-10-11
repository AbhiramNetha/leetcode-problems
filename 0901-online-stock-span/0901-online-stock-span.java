class StockSpanner {

    ArrayList<Integer> list = new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        // ArrayList<Integer> list = new ArrayList<>();
        list.add(price);
        int cnt =1;
        for(int i = list.size()-2;i>=0;i--){
            if(price >= list.get(i)){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */