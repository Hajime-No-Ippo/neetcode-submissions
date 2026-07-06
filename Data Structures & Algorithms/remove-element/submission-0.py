class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0
        for x in nums:
            if x ^ val != 0:
                nums[k] = x
                k += 1
        return k