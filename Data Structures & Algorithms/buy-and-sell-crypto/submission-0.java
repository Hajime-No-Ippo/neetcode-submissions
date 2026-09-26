class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n + 1];
        int min = prices[0];
        dp[0] = 0;
        for(int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(dp[i-1], prices[i] - min);
        }
        return dp[n-1];
    }
}
