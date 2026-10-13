class Solution {
    public boolean canReach(int[] arr, int start) {
        if(start>=arr.length||start<0||arr[start]<0){
            return false;
        }
        if(arr[start] == 0){
            return true;
        }
        int jump = arr[start];
        arr[start] = -1;

        return (
            canReach(arr,start+jump)||
            canReach(arr,start-jump)
        );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna