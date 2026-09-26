class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = nums1.length, i = len-1, max = 1000000001, l = m - 1, r = n - 1;
        while(r >= 0) {
            if (l >= 0 && nums1[l] > nums2[r]) nums1[i--] = nums1[l--];
            else nums1[i--] = nums2[r--];
        }
    }
}
