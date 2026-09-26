class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        int l = 0, r = s.length() - 1;
        while(l <= r) if(s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }
}
