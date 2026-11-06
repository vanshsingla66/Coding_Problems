class Solution {
    int[] day_in_month = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int startalice = totalday(arriveAlice);
        int endalice = totalday(leaveAlice);
        int startbob = totalday(arriveBob);
        int endbob = totalday(leaveBob);

        int overlapst = Math.max(startalice,startbob);
        int overlapend = Math.min(endalice,endbob);
        return Math.max(0,overlapend-overlapst+1);
        
    }
    public int totalday(String s){
        int month = Integer.parseInt(s.substring(0,2));
        int day = Integer.parseInt(s.substring(3,5));

        int d = day;
        for(int i=0;i<month-1;i++){
            d+=day_in_month[i];
        }
        return d;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna