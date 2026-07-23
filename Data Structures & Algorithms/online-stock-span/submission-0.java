class StockSpanner {
    private Deque<int[]> stk = new ArrayDeque<>();

    public StockSpanner() {
        stk = new ArrayDeque<>();
    }
    
    public int next(int price) {
        // if prefix bigger insert 1
        // any bigger adding 1 
        int span = 1;
        while(!stk.isEmpty() && stk.peek()[0] <= price) {
            span += stk.pop()[1];
        }
        stk.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */