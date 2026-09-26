class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int cnt = 1, zeros = 0;
        for(int i : nums) {
            if(i != 0) cnt *= i;
            else zeros++;
        }
        if(zeros > 1) return new int[nums.length];
        for(int i = 0; i < ans.length; i++) {
            if(zeros > 0) ans[i] = (nums[i] == 0) ? cnt : 0;
            else ans[i] = cnt / nums[i];
        }
        return ans;
    }
}  
