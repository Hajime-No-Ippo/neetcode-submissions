class Solution {
    public int mySqrt(int x) {
        // return (int)Math.sqrt(x);       
        int l = 0, r = x, res = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if((long) m * m > x) {
                r = m - 1;
            }else if ((long) m * m < x) {
                l = m + 1;
                res = m;
            } else return m;
        }   
        return res;
    }
}