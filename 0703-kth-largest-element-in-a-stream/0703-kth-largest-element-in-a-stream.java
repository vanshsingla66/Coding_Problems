class KthLargest {
    PriorityQueue<Integer> pq ;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for(int num:nums){
            pq.offer(num);
        }
        while(pq.size()>k){
            pq.poll();
        }
    }
    
    public int add(int val) {
        if(pq.size()==k){
            int a = pq.peek();
            if(a<val){
                pq.poll();
                pq.offer(val);
            }
        }
        else{
            pq.offer(val);
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