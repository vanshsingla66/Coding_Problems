class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum=0;
        for(int num:nums){
            totalSum +=num;
        }
        int[] ans = new int[n];
        int leftSum=0;

        for(int i =0; i<n; i++){
            int rightSum= totalSum-leftSum-nums[i];
            ans[i] = Math.abs(leftSum-rightSum);
            leftSum+= nums[i];
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna