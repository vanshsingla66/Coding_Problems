class Solution {
    public int maxProfit(int[] prices) {
        // int[] dp = new int[prices.length-1];
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna