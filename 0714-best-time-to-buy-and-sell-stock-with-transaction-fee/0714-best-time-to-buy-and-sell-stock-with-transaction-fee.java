class Solution {
    public int maxProfit(int[] prices, int fee) {
        int cash = 0;
        int hold = -prices[0];
        for(int price:prices){
            int prevCash = cash;

            cash = Math.max(cash,hold+price-fee);
            hold = Math.max(hold,prevCash-price);
        }
        return cash;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna