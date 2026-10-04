class Solution {
    public boolean checkValidString(String s) {
        int min =0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                min++;
                max++;
            }
            else if(s.charAt(i)==')'){
                max--;
                min--;
            }
            else{
                min--;
                max++;
            }

            if(max<0){
                return false;
            }
            min = Math.max(min,0);
        }
        return min==0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna