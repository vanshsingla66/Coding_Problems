class Solution {
    public int scoreOfParentheses(String s) {

        int depth = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                depth++;
            } 
            else {
                depth--;

                if (s.charAt(i - 1) == '(') {
                    ans += 1 << depth;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna