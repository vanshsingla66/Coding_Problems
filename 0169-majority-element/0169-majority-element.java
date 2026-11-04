class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
        int sum = 0;
        for(int num: nums){
            if(sum==0){
                ans = num;
            }
            if(num == ans){
                sum++;
            }
            else{
                sum--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna