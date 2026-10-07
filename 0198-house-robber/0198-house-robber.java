class Solution {
    public int rob(int[] nums) {
        int pr1 = 0;
        int pr2 = 0;
        for(int m : nums){
            int curr = Math.max(pr1,pr2+m);
            pr2 = pr1;
            pr1=curr;
        }
        return pr1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna