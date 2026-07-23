class Solution {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < j) {
            if(chars[i] != chars[j]) {
                return isValid(chars, i + 1, j) || isValid(chars, i, j - 1);
            }
            i++;
            j--;
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