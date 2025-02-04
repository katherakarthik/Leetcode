lass Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            List<List<Integer>>res1=new ArrayList<>();
            return res1;

        }
        Queue<TreeNode>q=new ArrayDeque<>();
        q.add(root);
        List<List<Integer>>res=new ArrayList<>();
        while(q.size()>0){
            int size=q.size();
            List<Integer>ans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode front=q.remove();
                ans.add(front.val);
                if(front.left!=null)q.add(front.left);
                if(front.right!=null)q.add(front.right);

            }
            res.add(ans);
        }
        return res;
    }
}
