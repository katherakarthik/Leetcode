class Solution {
    private int diff=0;
    public int findTilt(TreeNode root) {
        height(root);
        return diff;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
                                                                             //O(N), where N is the number of nodes in the tree. Each node is visited once.
        int lef=height(root.left);
        int rig=height(root.right);
        diff=Math.abs(diff,lef-rig);
        return Math.abs(left-rig)+1;
    }
}
