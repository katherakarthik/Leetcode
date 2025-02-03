class Solution {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean n=path(root,targetSum);
        return n;
        


        
    }
    public boolean path(TreeNode root,int target){
        if(root==null)return false;

        if(root.left==null&&root.right==null){
            if(target==root.val)return true;
            return false;
        }
        boolean ns=path(root.left,target-root.val);
        boolean as=path(root.right,target-root.val);

        return as||ns;

    }
    

}
