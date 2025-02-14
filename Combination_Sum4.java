class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        int res=Ways(target,nums,dp);
        return res;
    }
    public int Ways(int target,int nums[],int dp[]){
        if(target==0)return 1;
        if(target<0)return 0;
        if(dp[target]!=-1)return dp[target];
        int maway=0;
        for(int i=0;i<nums.length;i++){
            int way=Ways(target-nums[i],nums,dp);
            maway=maway+way;
        }
        dp[target]=maway;
        return maway;
    }
}
