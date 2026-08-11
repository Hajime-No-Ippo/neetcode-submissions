class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        var seen = new HashSet<Character>();
        for(; r < s.length(); r++) {
            while (seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));                
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
