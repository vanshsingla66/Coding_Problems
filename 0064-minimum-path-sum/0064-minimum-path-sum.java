
import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, grid, m, n, dp);
    }

    public int solve(int row, int column, int[][] grid,
                     int m, int n, int[][] dp) {

        if (row == m - 1 && column == n - 1) {
            return grid[row][column];
        }

        if (dp[row][column] != -1) {
            return dp[row][column];
        }

        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        if (column + 1 < n) {
            right = solve(row, column + 1, grid, m, n, dp);
        }

        if (row + 1 < m) {
            down = solve(row + 1, column, grid, m, n, dp);
        }

        dp[row][column] =
            grid[row][column] + Math.min(right, down);

        return dp[row][column];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna