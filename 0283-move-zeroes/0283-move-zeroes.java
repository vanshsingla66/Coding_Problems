class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            int temp = nums[left];
            nums[left] = nums[i];
            nums[i] = temp;
            
            left++;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna