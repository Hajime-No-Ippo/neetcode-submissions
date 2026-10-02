class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> seen;
        for (int i = 0; i != nums.size(); i++) {
            int res = target - nums[i];
            auto it = seen.find(res);
            if (it != seen.end()) return std::vector<int> {it -> second, i};
            seen[nums[i]] = i;
        }        
        return std::vector<int> {-1, -1};
    }
};
