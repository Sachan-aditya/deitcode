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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
         Queue<TreeNode> q=new LinkedList<>();
         if(root==null)
         return res;
         q.offer(root);
         while(!q.isEmpty())
         {
            double s=0;
            int levelsize=q.size();
            for(int i=0;i<levelsize;i++){
            TreeNode curr=q.poll();
             s+=curr.val;
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
            }
            res.add(s/levelsize);

            
         }
         return res;
    }
}