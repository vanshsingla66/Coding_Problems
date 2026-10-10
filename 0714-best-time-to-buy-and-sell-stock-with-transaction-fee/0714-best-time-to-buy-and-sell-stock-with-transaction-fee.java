class Solution {
    public int maxProfit(int[] prices, int fee) {
        int ans = 0;
        int hold = -prices[0];
        for(int price:prices){
            int prevCash = ans;

            ans = Math.max(ans,hold+price-fee);
            hold = Math.max(hold,prevCash-price);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna