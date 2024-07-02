
class Solution {
    public boolean isSameTree(TreeNode a, TreeNode b) {
        if(a==null&& b==null)
        return true;
        if(a==null || b==null)
        return false;
        if(a.val!=b.val)
        return false;
    boolean l=isSameTree(a.left,b.left);
    boolean r=isSameTree(a.right,b.right);
        return l&&r;
    }
}