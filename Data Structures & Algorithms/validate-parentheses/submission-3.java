class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c == '(' || c == '{' || c == '[') {
                stk.push(c);
                continue;
            }

            if (stk.isEmpty()) return false;
            char cur = stk.peek();

            if (c == ')' && cur == '(') {
                stk.pop();
            }
            else if (c == ']' && cur == '[') {
                stk.pop();
            }
            else if (c == '}' && cur == '{') {
                stk.pop();
            }
            else{
                return false;
            }
        }

        return stk.isEmpty();
        
    }
}
