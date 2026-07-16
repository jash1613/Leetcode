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
    List<Integer> l=new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
    public TreeNode construct(int low,int high,TreeNode root)
    {
        if(low>high)
        {
            return null;
        }
        int mid=(low+high)/2;
        root=new TreeNode(l.get(mid));
        root.left=construct(low,mid-1,root);
        root.right=construct(mid+1,high,root);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return construct(0,l.size()-1,root);
    }
}