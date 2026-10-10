class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k = (long) k1 + k2;
        int n = nums1.length;

        int[] diff = new int[n];
        int max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
            sum += diff[i];
        }

        if (sum <= k) return 0;

        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long ops = 0;

            for (int d : diff) {
                if (d > mid) {
                    ops += d - mid;
                }
            }

            if (ops <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        int limit = low;
        long ans = 0;

        for (int d : diff) {
            int reduced = Math.min(d, limit);
            ans += (long) reduced * reduced;
            k -= d - reduced;
        }

        // Use any remaining operations to reduce values at the limit by one.
        for (int i = 0; i < n && k > 0; i++) {
            if (diff[i] >= limit && diff[i] > 0) {
                ans -= (long) limit * limit;
                ans += (long) (limit - 1) * (limit - 1);
                k--;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna