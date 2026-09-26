class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int[] res = new int[k];
        int [] freq = new int[2001];
        for(int n : nums) freq[n + 1000]++;
        for(int i = 0; i < 2001; i++) if(freq[i] > 0) pq.offer(new int[]{i, freq[i]});
        do res[--k] = pq.poll()[0] - 1000; while(k > 0);
        return res;
    }
}
