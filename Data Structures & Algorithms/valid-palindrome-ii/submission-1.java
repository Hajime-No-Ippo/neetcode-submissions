class Solution {
    public boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;
        while(l < r) {
            if(c[l] != c[r]) {
                return isValid(c, l + 1, r) || isValid(c, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isValid(char[] c, int l, int r) {
        while(l < r) {
            if(c[l] != c[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}