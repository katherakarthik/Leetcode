class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
       int i= Path(root,targetSum)
       +pathSum(root.left,targetSum)
       +pathSum(root.right,targetSum);
       return i;
    }
    public int Path(TreeNode root,long target){


        if(root==null)return 0;
        int count=0;

        if(root.val==target)count=1;

      count+= Path(root.left,target-root.val);
       count+= Path(root.right,target-root.val);

        return count;
    }
}
