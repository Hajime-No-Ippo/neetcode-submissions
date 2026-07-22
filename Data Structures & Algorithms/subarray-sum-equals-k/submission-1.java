class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, curSum = 0;
        var pre_s = new HashMap<Integer, Integer>();
        pre_s.put(0, 1);
        for (int i : nums) {
            curSum += i;
            int diff = curSum - k;
            res += pre_s.getOrDefault(diff, 0);
            pre_s.put(curSum, pre_s.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}