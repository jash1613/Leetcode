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
    List<List<Integer>> l;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        solve(root,targetSum,l1);
        return l;
    }
    public void solve(TreeNode root,int s,List<Integer>l1)
    {
         if(root==null)
         {
            return;
         }

        l1.add(root.val);
        s-=root.val;
         if(s==0 && (root.left==null && root.right==null))
       {
         l.add(new ArrayList<>(l1));
       }
     
       solve(root.left,s,l1);
       solve(root.right,s,l1);
       l1.remove(l1.size()-1);
        
    }
}