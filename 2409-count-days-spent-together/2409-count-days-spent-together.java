class Solution {
    int[] d_m = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int ara = doy(arriveAlice);
        int lea = doy(leaveAlice);
        int arb = doy(arriveBob);
        int leb = doy(leaveBob);

        int os = Math.max(ara,arb);
        int oe = Math.min(lea,leb);
        return Math.max(0,oe-os+1); 
    }
    public int doy(String date){
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));

        int d = day;
        for(int i=0;i<month-1;i++){
            d+=d_m[i];
        }
        return d;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna