class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(k == 0) return;
        rotateOnce(nums);
        rotate(nums, k-1);
    }

    private void rotateOnce(int[] nums) {
        int n = nums.length;
        int last = nums[n - 1];
        for(int i = n - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
}