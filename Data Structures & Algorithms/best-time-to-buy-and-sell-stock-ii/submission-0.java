class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0, n = prices.length, cur = prices[0];;
        for(int p=1; p< n; p++) {
            if (prices[p] > cur) {
                prof += (prices[p] - cur);
                cur = prices[p];
            }else{
                cur = prices[p];
            }
        }
        return prof;
    }
}