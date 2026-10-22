class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1;
            }
        }
        return solve(grid,0,0,memo);
    }
    public int solve(int[][] grid, int cr, int cc,int[][] memo){
        if(cr==grid.length-1&&cc==grid[0].length-1){
            return grid[cr][cc];
        }
        if(cr>=grid.length || cc>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(memo[cr][cc]!=-1){
            return memo[cr][cc];
        }
        int r = solve(grid,cr,cc+1,memo);
        int d = solve(grid,cr+1,cc,memo);

        return memo[cr][cc] = grid[cr][cc] + Math.min(r,d);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna