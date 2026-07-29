class Solution {
    public int search(int[] nums, int target) {
        int r = 0, l = nums.length - 1, mid = 0;
        while (r <= l) {
            mid = r + (l - r) / 2;
            if(nums[mid] < target) r = mid + 1;
            else if(nums[mid] > target) l = mid - 1;
            else return mid;
        }
        return -1;
    }
}
