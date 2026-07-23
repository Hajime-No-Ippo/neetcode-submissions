class MyStack {
    public ArrayDeque<Integer> stk = new ArrayDeque<>();

    public MyStack() {
   
    }
    
    public void push(int x) {
        stk.push(x);        
    }
    
    public int pop() {
        return stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */