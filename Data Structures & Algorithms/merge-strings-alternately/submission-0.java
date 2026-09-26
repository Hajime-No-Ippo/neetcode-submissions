class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, m = word1.length(), n = word2.length(), max = m > n ? m : n;
        StringBuilder sb = new StringBuilder();
        while(i < max) {
            if(max == m) {
                if(i < n) {
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                    i++;
                }else{
                    sb.append(word1.charAt(i++));
                }
            }else{
                if(i < m) {
                    sb.append(word1.charAt(i));
                    sb.append(word2.charAt(i));
                    i++;
                }else{
                    sb.append(word2.charAt(i++));
                }
            }
        }
        return sb.toString();
    }
}