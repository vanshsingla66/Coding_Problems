class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        int n = gain.length;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna