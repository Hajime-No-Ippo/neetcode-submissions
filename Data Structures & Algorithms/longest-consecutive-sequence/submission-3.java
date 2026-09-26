class Solution {
    // public boolean isCons(int a, int b){
    //     return b - a == 1;
    // }
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 0, max = 1, i = 0;
        Set<Integer> uniq = new LinkedHashSet<>();
        for (int n : nums) {
            uniq.add(n);
        }
        for(int n : nums) {
            if(!uniq.contains(n - 1)) {
                int cur = n;
                int len = 0;
                while(uniq.contains(cur)) {
                    len++;
                    cur++;
                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}
