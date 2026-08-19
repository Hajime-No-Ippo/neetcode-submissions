class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] tails = new int[26];
        int n = s.length();
        for(int i = 0; i < n; i++) tails[s.charAt(i) - 'a'] = i;
        var res = new ArrayList<Integer>();
        int start = 0, end = 0;
        for(int i = 0; i < n; i++) {
            end = Math.max(end, tails[s.charAt(i) - 'a']);
            if(i == end) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}
