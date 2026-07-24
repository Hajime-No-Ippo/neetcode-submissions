/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        var queue = new ArrayDeque<TreeNode>();
        var ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int s = queue.size();
            var layer = new ArrayList<Integer>();
            for (int i = 0; i < s; i++) {
                TreeNode cur = queue.pollFirst();
                layer.add(cur.val);
                if(cur.left != null) queue.addLast(cur.left);
                if(cur.right != null) queue.addLast(cur.right);
            }
            ans.add(layer);
        }
        return ans;
    }
}
