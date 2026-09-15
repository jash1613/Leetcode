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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> l1 = new ArrayList<>();

        if (root == null) {
            return l1;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        int c = 0;

        while (!q.isEmpty()) {

            int s = q.size();
            List<Integer> l = new ArrayList<>();

            for (int i = 0; i < s; i++) {

                TreeNode curr = q.poll();

                l.add(curr.val);

                if (curr.left != null) {
                    q.offer(curr.left);
                }

                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }

            if (c % 2 == 0) {
                l1.add(l);
            } else {
                Collections.reverse(l);
                l1.add(l);
            }

            c++;
        }

        return l1;
    }
}