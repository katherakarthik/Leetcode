class Solution {
    private int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;                                                          //The time complexity is O(N), where N is the number of nodes in the tree, as each node is visited once.
        }
        int lef=height(root.left);
        int rig=height(root.right);

        diameter=Math.max(diameter,lef+rig);
        return Math.max(lef,rig)+1;

    }
}
