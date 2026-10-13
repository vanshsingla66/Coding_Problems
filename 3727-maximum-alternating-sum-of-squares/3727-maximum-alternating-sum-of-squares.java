class Solution {
    long ans = 0;
    public long maxAlternatingSum(int[] nums) {
        
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        
        long ans = 0;
        int mid = nums.length/2;

        for(int i=0;i<mid;i++){
            ans -= arr[i];
        }
        for(int i=mid;i<nums.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna