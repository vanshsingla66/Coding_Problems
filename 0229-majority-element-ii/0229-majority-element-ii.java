class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int key: mp.keySet()){
            if(mp.get(key)>n){
                ans.add(key);
            }
        }
        return ans;
        
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna