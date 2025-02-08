class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n=cost.length;

        
        int dp[]=new int[n+1];
        dp[n]=0;

        for(int i=dp.length-2;i>=0;i--){
            if(i==dp.length-2){
                dp[i]=cost[i]+dp[i+1];
            }
            else{
            dp[i]=cost[i]+Math.min(dp[i+1],dp[i+2]);
            }
        }
        int ans=Math.min(dp[0],dp[1]);
        return ans;
    }
}
