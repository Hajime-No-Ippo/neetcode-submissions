class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        minimum = min(len(s) for s in strs)
        og = strs[0][:minimum]

        for s in strs:
            while s[:len(og)] != og:
                og = og[:-1]
        
        return og
            
