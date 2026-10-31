class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // for(int num:nums){
        //     if(!hs.contains(num)){
        //         hs.add(num);
        //     }            
        //     else{
        //         return num;
        //     }
        // }
        // return -1;
        int slow = nums[0];
        int fast = nums[nums[0]];
        // slow = nums[slow];
        // fast = nums[nums[fast]];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna