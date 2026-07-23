class Solution{
    public int calPoints(String[] operations) {
        var stk = new ArrayDeque<Integer>();
        int res = 0;
        for (String o : operations){
            if (o.equals("C")) stk.pop();
            else if(o.equals("D")) stk.push(stk.peek() * 2);
            else if(o.equals("+")) {
                int top = stk.pop();
                int nxtTop = top + stk.peek();
                stk.push(top);
                stk.push(nxtTop);
            }else stk.push(Integer.parseInt(o));
        }
        for(int s : stk) res += s;
        return res;
    }
}