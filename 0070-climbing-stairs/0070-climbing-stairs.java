class Solution {
    public int climbStairs(int n) {
        int curr = 1;
        int prev = 1;
        for(int i=0;i<n;i++){
            int temp = curr;
            curr = curr+prev;
            prev = temp;

        }
        return prev;
        // return climbStairs(n-1)+climbStairs(n-2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna