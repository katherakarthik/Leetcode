class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String>st=new ArrayList<>();
        Path(root,st,"");
        
        return st;
    }
    public void Path(TreeNode root,List<String>res,String pat){
        if(root==null)return ;
        if(root.left==null&&root.right==null){
            res.add(pat+root.val);
        }
        Path(root.left,res,pat+root.val+"->");
        Path(root.right,res,pat+root.val+"->");

    }
}
