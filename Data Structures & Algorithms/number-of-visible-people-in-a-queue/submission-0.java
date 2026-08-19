class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        var stack = new ArrayDeque<Integer>();
        int n = heights.length;
        int[] res = new int[n];
        for(int i = n - 1 ;i >= 0; i--) {
            // int times = 0;
            while(!stack.isEmpty() && heights[i] > heights[stack.peek()]) {
                res[i]++;
                stack.pop();
            }
            if (!stack.isEmpty()) res[i]++;
            stack.push(i);
        }

        // res[n - 1] = 0;
        // int last_idx = stack.peek();

        // int size = stack.size();
        // while(size > 0) {
        //     int cur_idx = stack.pop();
        //     res[cur_idx] = last_idx - cur_idx;
        //     last_idx = cur_idx; 
        // }

        return res;
    }
}