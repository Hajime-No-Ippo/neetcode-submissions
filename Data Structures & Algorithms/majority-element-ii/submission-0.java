class Solution {
    public List<Integer> majorityElement(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        var ans = new HashSet<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {            
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > (n/3)) ans.add(nums[i]);
        }
        return new ArrayList<>(ans);
    }
}