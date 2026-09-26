class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        strs.forEach((v) -> {
            sb.append(v.length()).append("#").append(v); 
        });
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i,j));
            ans.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }
        return ans;
    }
}
