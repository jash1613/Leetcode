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
        Queue<TreeNode> q=new LinkedList<>();
     List<List<Integer>> l1=new ArrayList<>();
     if(root==null)
     {
        return new ArrayList<>();
     }
     q.offer(root);
     while(!q.isEmpty())
     {
        int size=q.size();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            TreeNode curr= q.poll();
            l.add(curr.val);
            if(curr.left!=null)
            {
                q.offer(curr.left);
            }
            if(curr.right!=null)
            {
                q.offer(curr.right);
            }
        }
        l1.add(l);
     }
    return l1;
     }
    }
