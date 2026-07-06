class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        seen = {}
        for n in nums:
            seen[n] = seen.get(n, 0) + 1
        return max(seen, key=seen.get)
