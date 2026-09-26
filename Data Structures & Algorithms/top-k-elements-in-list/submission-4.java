class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] freq = new int[2001];
        int [] ans = new int[k];
        for (int n : nums) freq[n + 1000]++;
        Integer[] indices = new Integer[freq.length];
        for (int i = 0; i < freq.length; i++) indices[i] = i;
        Arrays.sort(indices, (a, b) -> freq[b] - freq[a]);
        for (int i = 0; i < k; i++) ans[i] = (indices[i] - 1000);
        return ans;
    }
}
