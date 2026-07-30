class Solution {
    static int findFloor(int[] arr, int x) {

        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] <= x) {
                ans = mid;      
                lo = mid + 1;   
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna