class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        String s = "";
        solve(n,0,0,s,ans);
        return ans; 
    }
    public void solve(int n, int left, int right, String s, ArrayList<String> ans){
        if(s.length()==n*2){
            ans.add(s);
            return ;
        }
        if(left<n){
            solve(n,left+1,right,s+"(",ans);
        }
        if(right<left){
            solve(n,left,right+1,s+")",ans);
        }
    } 
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna