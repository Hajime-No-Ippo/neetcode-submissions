class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length, i = 0; 
        Arrays.sort(nums);
        for(; i < n; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) r--;                
                else if(sum < 0) l++;
                else{
                    ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                    while(r > l && nums[r] == nums[r + 1]) r--; 
                    while(r > l && nums[l] == nums[l - 1]) l++;
                }
            }
        }
        return ls;
    }
}
