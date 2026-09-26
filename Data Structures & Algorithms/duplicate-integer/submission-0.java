class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        Set<Integer> seen = new HashSet<>();
        for(int i : nums) {
            if(seen.contains(i)) {
                return true;
            }
            seen.add(i);
        }
        return false;
    }
}