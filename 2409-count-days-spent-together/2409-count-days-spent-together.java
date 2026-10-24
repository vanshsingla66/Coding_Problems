class Solution {
    int[] DAYS_IN_MONTH = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceStart = doy(arriveAlice);
        int aliceEnd = doy(leaveAlice);
        int bobStart = doy(arriveBob);
        int bobEnd = doy(leaveBob);

        int overlapStart = Math.max(aliceStart,bobStart);
        int overlapEnd = Math.min(aliceEnd,bobEnd);
        return Math.max(0,overlapEnd-overlapStart+1); 
    }
    public int doy(String date){
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));

        int dayOfYear = day;
        for(int i=0;i<month-1;i++){
            dayOfYear+=DAYS_IN_MONTH[i];
        }
        return dayOfYear;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna