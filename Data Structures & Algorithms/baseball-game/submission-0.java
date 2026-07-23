class Solution{
    public int calPoints(String[] operations) {
        var stk = new ArrayDeque<Integer>();
        int res = 0;
        for (String o : operations){
            switch (o) {
                case "C":
                    stk.pop();
                    break;
                case "D":
                    stk.push(stk.peek() * 2);
                    break;
                case "+":
                    int top = stk.pop();
                    int newTop = top + stk.peek();
                    stk.push(top);
                    stk.push(newTop);
                    break;
                default:
                    stk.push(Integer.parseInt(o));
            }
        };
        for (int score : stk) res += score;
        return res;
    }
}