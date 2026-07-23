class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        if(n == 0) return new int[0];
        var stk = new ArrayDeque<Integer>();
        for(int a : asteroids) {
            boolean d = false;
            while(!stk.isEmpty() && a < 0 && stk.peek() > 0) {
                int cur = stk.peek();
                if(Math.abs(a) < Math.abs(cur)) {
                    d = true;
                    break;
                }else if (Math.abs(a) == Math.abs(cur)) {
                    stk.pop();
                    d = true;
                    break;
                }else {
                    stk.pop();
                }
            }
            if(!d) stk.push(a);
        }

        var res = new int[stk.size()];
        int idx = stk.size();
        for (int i : stk) res[--idx] = i;
        return res;
    }
}