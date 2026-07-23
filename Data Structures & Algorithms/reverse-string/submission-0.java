class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length;
        while(i < j) {
            swap(s, i++, --j);
        }
    }
    void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}