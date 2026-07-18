class Solution {
    int n;
    int []dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        n=cost.length;
        return Math.min(solve(0,cost),solve(1,cost));

    }
    public int solve(int i,int []cost)
    {
        if(i>=n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int x=cost[i]+solve(i+1,cost);
        int y=cost[i]+solve(i+2,cost);
        dp[i]=Math.min(x,y);
        return dp[i];
    }
}