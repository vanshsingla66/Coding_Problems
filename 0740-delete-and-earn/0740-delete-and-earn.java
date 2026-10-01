class Solution {
    public int deleteAndEarn(int[] nums) {

        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        int[] ans = new int[max+1];

        for(int i=0;i<nums.length;i++){
            ans[nums[i]] += nums[i];
        }
        int prev1 =0;
        int prev2 = 0;
        for(int i=1;i<ans.length;i++){
            int curr = Math.max(prev1,prev2+ans[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna