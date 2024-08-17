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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return res;
        q.offer(root);
        while(!q.isEmpty())
        {
            int levelsize=q.size();
            List<Integer> levellist=new ArrayList<>();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode node=q.poll();
                levellist.add(node.val);
                if(node.left!=null)
               q.offer(node.left);
                 if(node.right!=null)
               q.offer(node.right);
            }
            res.add(levellist);
        }
        Collections.reverse(res);
        return res;
    
    }
}