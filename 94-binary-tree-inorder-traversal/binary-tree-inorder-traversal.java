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
//         List<Integer> res=new ArrayList<>();
//         inorder(root,res);
//         return res;
        
//     }
//     private void inorder(TreeNode root,List<Integer> res)
//     {
//         if(root==null)
//         return ;
//         inorder(root.left,res);
//         res.add(root.val);
//         inorder(root.right,res);
//     }
// }
List<Integer> res=new ArrayList<>();
Stack<TreeNode> stack=new Stack<>();
if(root==null)return res;
 TreeNode curr=root;
while(!stack.isEmpty()||curr!=null)
{
   while(curr!=null){
    stack.push(curr);
    curr=curr.left;
   }
   curr=stack.pop();
    res.add(curr.val);
    curr=curr.right;
   }

return res;
    }
}