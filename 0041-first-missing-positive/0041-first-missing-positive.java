class Solution {
    public int firstMissingPositive(int[] nums) {
        // Arrays.sort(nums);
        // int expected = 1;
        // for(int num:nums){
        //     if(num<expected){
        //         continue;
        //     }
        //     else if(num==expected){
        //         expected++;
        //     }
        //     else{
        //         return expected;
        //     }
        // }
        // return expected;
        int[] temp = new int[nums.length];
        for(int i:nums){
            if(i>=1 && i<=nums.length){
                temp[i-1] = i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(temp[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna