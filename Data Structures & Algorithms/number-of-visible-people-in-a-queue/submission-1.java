class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        var stack = new ArrayDeque<Integer>();
        int n = heights.length;
        int[] res = new int[n];
        for(int i = n - 1 ;i >= 0; i--) {
            int time = 0;
            while(!stack.isEmpty() && heights[i] > heights[stack.peek()]) {
                time++;
                res[i] = time;
                stack.pop();
            }
            if (!stack.isEmpty()) res[i]++;
            stack.push(i);
        }
        return res;
    }
}