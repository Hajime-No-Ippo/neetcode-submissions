class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> seen = new HashMap<>();
        for (String s : strs) {
            char[] key = s.toCharArray();
            Arrays.sort(key);
            String sum = new String(key);
            seen.computeIfAbsent(sum, k -> new ArrayList<>()).add(s);
            
        }
        // seen.forEach((k,v) -> ans.add(new ArrayList<>(v)));
        return new ArrayList<>(seen.values());
    }
}
