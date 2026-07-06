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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int currentsum=0;
        return pathsum(root,targetSum,currentsum);
    }
    public boolean pathsum(TreeNode root,int sum,int s)
    {
        if(root==null)
        {
            return false;
        }
        s+=root.val;
        if(s==sum && (root.left==null && root.right==null))
        {
            return true;
        }
        return pathsum(root.left,sum,s) || pathsum(root.right,sum,s);
  
    }
}