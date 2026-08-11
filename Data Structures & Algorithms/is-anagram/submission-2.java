class Solution {
    public boolean isAnagram(String s, String t) {
        var map = new int[256];
        int i = 0, j = 0, n = s.length(), m = t.length();

        if(m != n) {
            return false;
        }
        
        for (char c : s.toCharArray()) map[c - 'a']++;
        for (char c : t.toCharArray()) {
            map[c - 'a']--;
            if(map[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
