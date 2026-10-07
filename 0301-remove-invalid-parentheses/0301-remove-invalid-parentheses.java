class Solution {
    HashSet<String> hs = new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int rr = 0;
        int rl = 0;
        int bal = 0;
        for(char c:s.toCharArray()){
            if(c=='('){
                bal++;
            }
            else if(c==')'){
                if(bal>0){
                    bal--;
                }
                else{
                    rr++;
                }
            }
            
        }
        rl = bal;
        solve(s,0,rl,rr,0,new StringBuilder());
        return new ArrayList<>(hs);
    }
    public void solve(String s, int index, int rl, int rr, int bal, StringBuilder current){
        if(index == s.length()){
            if(rr==0&&rl==0&&bal==0){
                hs.add(current.toString());
            }
            return;
        }
        char c = s.charAt(index);

        if(c=='(' && rl>0){
            solve(s,index+1,rl-1,rr,bal,current);
        }
        else if(c==')' && rr>0){
            solve(s,index+1,rl,rr-1,bal,current);
        }
        
        current.append(c);
        if(c!=')' && c!='('){
            solve(s,index+1,rl,rr,bal,current);
        }
        else if(c=='('){
            solve(s,index+1,rl,rr,bal+1,current);
        }
        else if(bal>0){
            solve(s,index+1,rl,rr,bal-1,current);
        }
        current.deleteCharAt(current.length()-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna