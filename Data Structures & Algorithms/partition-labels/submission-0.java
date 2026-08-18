class Solution {
    public List<Integer> partitionLabels(String s) {
        var map = new HashMap<Character, Integer>();
        var set = new HashSet<Character>();
        var res = new ArrayList<Integer>();
        
        int l = 0;
        // Largest partition -> search to the end to find the tail
        char[] char_arr = s.toCharArray();
        for(int i = 0; i < char_arr.length; i++) {
            map.put(char_arr[i], i);
        }

        for(int i = 0; i < char_arr.length; i++) {
            char ch = char_arr[i];
            if (i == map.get(ch)) {
                set.remove(ch);
                if(set.isEmpty()) {
                    res.add(i - l + 1);
                    l = i + 1;
                }
            }else{
                set.add(ch);
            }
        }
        return res;
    }
}
