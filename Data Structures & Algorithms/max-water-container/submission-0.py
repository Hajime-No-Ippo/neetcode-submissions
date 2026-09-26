class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0, len(heights) - 1
        max_area = 0
        while left < right:
            cur_area = min(heights[left], heights[right]) * (right - left)
            max_area = max(max_area, cur_area)

            if heights[left] > heights[right]:
                right -= 1
            else:
                left += 1
        return max_area