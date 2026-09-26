class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        for(int i = 0; i <= (m - n); i++) {
            int arrange = i + n;
            String s3 = s2.substring(i, arrange);
            if(checkPer(s1, s3)){
                return true;
            }
        }
        return false;
    }


    public boolean checkPer(String a, String b) {
        int[] freq = new int[26];

        for(char c : a.toCharArray()) {
            freq[c - 'a']++;
        }

        for(char c : b.toCharArray()) {
            freq[c - 'a']--;
        }

        for(int count : freq) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
