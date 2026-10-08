class Solution {
    public String removeOuterParentheses(String s) {
        int bal = 0;
        return solve(s,new StringBuilder(),bal);
    }
    public static String solve(String s, StringBuilder ch,int bal){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                if(bal>0){
                    ch.append(c);
                }
                bal++;
                
            }
            else{
                bal--;
                if(bal>0){
                    ch.append(c);
                }
            }
            
        }
        return ch.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna