class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        res = []
        res.extend(nums)
        res.extend(nums)
        return res
        