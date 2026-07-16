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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode =new TreeNode(val);
         TreeNode curr=root;
        if(root==null)
        {
            root=newnode;
            return root;
        }
        else
        {
            while(true)
            {
                  if(val<curr.val)
                  {
                    if(curr.left==null)
                    {
                        curr.left=newnode;
                        break;
                    }
                    else
                    {
                        curr=curr.left;
                    }
                  }
                  else
                  {
                       if(curr.right==null)
                       {
                        curr.right=newnode;
                        break;
                       }
                       else
                       {
                        curr=curr.right;
                       }
                  }
            }
        }
        return root;
    }
}