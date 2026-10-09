class Solution {
    public int climbStairs(int n) {
        int com1=1;
        int com2=1;
        for(int i=0;i<n;i++){
            int temp = com1;
            com1 = com1+com2;
            com2 = temp;

        }
        return com2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna