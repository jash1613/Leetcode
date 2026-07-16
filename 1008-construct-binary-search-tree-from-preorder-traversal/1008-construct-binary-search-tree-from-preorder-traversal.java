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
    public TreeNode construct(int low,int high,int []preorder)
    {
        if(low>high)
        {
            return null;
        }
        TreeNode root=new TreeNode(preorder[low]);
        int i=low+1;
        while(i<preorder.length&& preorder[i]<preorder[low])
        {
            i++;
        }
        root.left=construct(low+1,i-1,preorder);
        root.right=construct(i,high,preorder);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(0,preorder.length-1,preorder);
    }
}