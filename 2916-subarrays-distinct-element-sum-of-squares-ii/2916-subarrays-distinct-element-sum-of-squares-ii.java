
class Solution {
    private static final long MOD = 1_000_000_007L;

    public int sumCounts(int[] nums) {
        int n = nums.length;

        long[] sum = new long[4 * n];
        long[] squareSum = new long[4 * n];
        long[] lazy = new long[4 * n];

        int[] last = new int[100001];
        java.util.Arrays.fill(last, -1);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int left = last[nums[i]] + 1;

            update(1, 0, n - 1, left, i,
                   sum, squareSum, lazy);

            last[nums[i]] = i;
            ans = (ans + squareSum[1]) % MOD;
        }

        return (int) ans;
    }

    private void update(
        int node, int start, int end,
        int left, int right,
        long[] sum, long[] squareSum, long[] lazy
    ) {
        if (start > right || end < left) {
            return;
        }

        if (left <= start && end <= right) {
            apply(node, start, end, 1,
                  sum, squareSum, lazy);
            return;
        }

        push(node, start, end, sum, squareSum, lazy);

        int mid = (start + end) / 2;

        update(node * 2, start, mid, left, right,
               sum, squareSum, lazy);

        update(node * 2 + 1, mid + 1, end, left, right,
               sum, squareSum, lazy);

        sum[node] =
            (sum[node * 2] + sum[node * 2 + 1]) % MOD;

        squareSum[node] =
            (squareSum[node * 2] + squareSum[node * 2 + 1]) % MOD;
    }

    private void apply(
        int node, int start, int end, long add,
        long[] sum, long[] squareSum, long[] lazy
    ) {
        long length = end - start + 1L;

        squareSum[node] = (
            squareSum[node]
            + 2 * add % MOD * sum[node] % MOD
            + add * add % MOD * length % MOD
        ) % MOD;

        sum[node] = (sum[node] + add * length) % MOD;
        lazy[node] = (lazy[node] + add) % MOD;
    }

    private void push(
        int node, int start, int end,
        long[] sum, long[] squareSum, long[] lazy
    ) {
        if (lazy[node] == 0 || start == end) {
            return;
        }

        int mid = (start + end) / 2;
        long pending = lazy[node];

        apply(node * 2, start, mid, pending,
              sum, squareSum, lazy);

        apply(node * 2 + 1, mid + 1, end, pending,
              sum, squareSum, lazy);

        lazy[node] = 0;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna