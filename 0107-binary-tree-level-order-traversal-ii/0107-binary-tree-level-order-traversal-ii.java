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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> l1 = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();

        if (root == null) {
            return l1;
        }

        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> l = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();

                l.add(temp.val);

                if (temp.left != null) {
                    q.offer(temp.left);
                }

                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }

            l1.add(l);
        }

        Collections.reverse(l1);

        return l1;
    }
}