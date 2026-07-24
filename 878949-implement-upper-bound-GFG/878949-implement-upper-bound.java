class Solution {
    int upperBound(int[] arr, int target) {
        // code here
             int n = arr.length;
        int lo = 0, hi = n - 1;
        int ub = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] > target) {
                ub = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ub;
    }
}
    

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna