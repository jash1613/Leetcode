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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
       return inorder(root,l1);
    }
    public List<Integer> inorder(TreeNode root,List l1)
    {
        if(root==null)
        {
            return l1;
        }
        inorder(root.left,l1);
        l1.add(root.val);
        inorder(root.right,l1);
        return l1;
    }
}