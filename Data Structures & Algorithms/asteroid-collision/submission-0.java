class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;        
        if(n == 0) return new int[0];

        var stk = new ArrayDeque<Integer>();
        for (int a : asteroids) {
            boolean destroyed = false;
            while(!stk.isEmpty() && stk.peek() > 0 && a < 0){
                int cur = stk.peek();
                if(Math.abs(a) > Math.abs(cur)) stk.pop();
                else if(Math.abs(a) == Math.abs(cur)) {
                    stk.pop();
                    destroyed = true;
                    break;
                }else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed) stk.push(a);
        }

        var res = new int[stk.size()];
        int idx = stk.size();
        for(int i : stk) res[--idx] = i;
        return res;
    }
}