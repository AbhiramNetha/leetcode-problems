class pair{
    int frst;
    int second;
    pair(int frst,int second){
        this.frst = frst;
        this.second = second;
    }
}
class StockSpanner {

    
    Stack<int[]> st = new Stack<>();
    public StockSpanner() {
    }
    
    public int next(int price) {
        // list.add(price);
        // int cnt =1;
        // for(int i = list.size()-2;i>=0;i--){
        //     if(price >= list.get(i)){
        //         cnt++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return cnt;
        int span = 1;
        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.pop()[1];
        }
        // ans = ind - (s.isEmpty()?-1:st.peek().second);
        st.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */