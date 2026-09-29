class Solution {
    int m,n;
    char[][] grid;
    Boolean[][][] dp;
    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        if((m+n-1)%2 == 1){
            return false;
        }
        dp = new Boolean[m][n][m+n];
        return dfs(0,0,0);
    }
    public boolean dfs(int i,int j,int bal){
        if(grid[i][j] == '('){
            bal++;
        }
        else{
            bal--;
        }
        if(bal<0){
            return false;
        }
        if(bal>(m-i)+(n-j)-1){
            return false;
        }
        if(i==m-1 && j==n-1){
            return bal==0;
        }
        if(dp[i][j][bal] != null){
            return dp[i][j][bal];
        }
        boolean result = false;
        if(i+1<m){
            result = dfs(i+1,j,bal);
        }
        if(!result && j+1<n){
            result = dfs(i,j+1,bal);
        }
        return dp[i][j][bal] = result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna