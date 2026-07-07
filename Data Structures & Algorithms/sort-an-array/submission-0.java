class Solution {
    public int[] sortArray(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            for(int j = i+ 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                } 
            }
        }
        return nums;
    }
}