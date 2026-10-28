class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int ans_ind = nums.length;
        while(start<nums.length){
            if(nums[start]<target){
                start++;
            }
            else if(nums[start]>target){
                ans_ind = start;
                break;
            }
            else{
                return start;
            }
        }
        return ans_ind;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna