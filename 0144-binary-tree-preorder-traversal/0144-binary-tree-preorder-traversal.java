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
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> l1 = new ArrayList<>();
        preOrder(l1, root);
        return l1;
    }

    public void preOrder(List<Integer> l1, TreeNode root) {
        if (root == null) {
            return;
        }

        l1.add(root.val);       
        preOrder(l1, root.left); 
        preOrder(l1, root.right);
    }
    
}