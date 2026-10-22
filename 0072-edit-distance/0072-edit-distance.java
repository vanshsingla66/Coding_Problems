class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return min_opr(word1,word2,0,0,dp);

    }
    public int min_opr(String word1,String word2,int i, int j,int[][] dp){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            dp[i][j] = min_opr(word1,word2,i+1,j+1,dp);
        }
        else{
            int d = min_opr(word1,word2,i+1,j,dp);
            int r = min_opr(word1,word2,i+1,j+1,dp);
            int in = min_opr(word1,word2,i,j+1,dp);
            dp[i][j] = Math.min(d,Math.min(r,in))+1; 
        }
        return dp[i][j];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna