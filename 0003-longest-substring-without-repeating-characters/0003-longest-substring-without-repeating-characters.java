class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int ans=0;
        HashSet<Character> hs=new HashSet<>();

        for(int i=0;i<n;i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(i));
            ans = Math.max(ans,i+1-left);

        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna