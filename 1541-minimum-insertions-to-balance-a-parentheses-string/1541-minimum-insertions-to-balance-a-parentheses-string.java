class Solution {
    public int minInsertions(String s) {
        int bal = 0;
        int ans =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                bal+=2;
                if(bal%2!=0){
                    ans++;
                    bal--;
                }
            }
            else{
                bal--;
                if(bal < 0){
                    bal = 1;
                    ans++;
                }
            }

        }
        return bal+ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna