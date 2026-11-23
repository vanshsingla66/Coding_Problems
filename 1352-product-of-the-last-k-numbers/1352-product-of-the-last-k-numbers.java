class ProductOfNumbers {
    ArrayList<Integer> al;
    public ProductOfNumbers() {
        al = new ArrayList<>();
        al.add(1);
    }
    
    public void add(int num) {
        if(num==0){
            al.clear();
            al.add(1);
        }
        else{
            int a = al.get(al.size()-1);
            al.add(a*num);
        }
    }
    
    public int getProduct(int k) {
        int n = al.size();
        if(k>=n){
            return 0;
        }
        return al.get(n-1)/al.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna