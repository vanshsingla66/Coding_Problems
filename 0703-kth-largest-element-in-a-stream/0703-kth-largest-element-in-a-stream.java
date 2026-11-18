class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int num:nums){
            pq.offer(num);
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>size){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna