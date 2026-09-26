class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, n = s.length(), m = t.length();

        if(m != n) {
            return false;
        }
        
        while(i < n || j < m) {
            if(i < n) {
                // Index i branch
                if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), 1);
                    i++;
                }else{
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    i++;
                }
            } else {
                // Index j branch
                if(!map.containsKey(t.charAt(j))){
                    return false;
                }else{
                    map.put(t.charAt(j),  map.get(t.charAt(j)) - 1);
                    if(map.get(t.charAt(j)) < 0) {
                        return false;
                    }
                    j++;
                }
            }
        }
        return true;
    }
}
