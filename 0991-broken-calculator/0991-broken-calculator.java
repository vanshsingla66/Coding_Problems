class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        while(startValue<target){
            if(target%2==0){
                target = target/2;
            }
            else{
                target = target+1;
            }
            ans++;
        }
            
        ans+= startValue-target;
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna