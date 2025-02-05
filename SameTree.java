class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isS(p,q);
    }
    public boolean isS(TreeNode p,TreeNode q){
        if(p==null&&q==null)return true;
        
        if(p==null||q==null)return false;

        if(p.val!=q.val)return false;

        
        return isS(p.left,q.left)&&isS(p.right,q.right);
    }
}
