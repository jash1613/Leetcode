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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l1=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        if(root==null)
        {
            return l1;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
             int s=q.size();
             for(int i=0;i<s;i++)
             {
                  TreeNode curr=q.poll();
                  if(i==s-1)
                  {
                      l1.add(curr.val);

                  }
                  if(curr.left!=null)
                  {
                    q.offer(curr.left);
                  }
                  if(curr.right!=null)
                  {
                    q.offer(curr.right);
                  }
             }

        }
        return l1;
    }
}