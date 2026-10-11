class Solution {
    public String simplifyPath(String path) {
        var str1 = path.replaceAll("/{2,}", "/");
        var stk = new ArrayDeque<String>();
        var sb = new StringBuilder();
        String[] pth = str1.split("/");

        for (String p : pth) {
            if (p.equals("..")) {
                if (!stk.isEmpty()) stk.pop();
            }
            else if (!p.isEmpty() && !p.equals(".")) stk.push(p);
        }

        while (!stk.isEmpty()) {
            sb.append("/");
            sb.append(stk.pollLast());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}