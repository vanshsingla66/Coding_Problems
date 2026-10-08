class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        int zero = min_cost(cost,0,dp);
        int one = min_cost(cost,1,dp);
        return Math.min(zero,one);
    }
    public static int min_cost(int[] cost, int i, int[] dp){
        if(i>=cost.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int f = min_cost(cost,i+1, dp);
        int s = min_cost(cost,i+2, dp);
        return dp[i] = Math.min(f,s) + cost[i];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna