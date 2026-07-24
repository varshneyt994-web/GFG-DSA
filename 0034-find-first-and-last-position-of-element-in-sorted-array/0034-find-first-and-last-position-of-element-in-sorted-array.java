class Solution {

    public int lowerBound(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public int upperBound(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = n;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);

        if (first == nums.length || nums[first] != target)
            return new int[]{-1, -1};

        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna