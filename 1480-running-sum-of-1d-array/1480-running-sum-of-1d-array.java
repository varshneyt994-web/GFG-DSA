class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna