class Solution {
    // int[][] dp;
    public int uniquePaths(int m, int n) {
    //     dp = new int[m+1][n+1];
    //     return solve(m,n);

    // }
    // public int solve(int m, int n){
    //     if(m==1 || n==1){
    //         return 1;
    //     }
    //     if(dp[m][n] != 0){
    //         return dp[m][n];
    //     }

    //     int up = solve(m-1,n);
    //     int left = solve(m,n-1);

    //     return dp[m][n] = up+left;
    // }
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna