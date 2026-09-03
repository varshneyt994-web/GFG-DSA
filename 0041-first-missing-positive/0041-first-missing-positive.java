class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
         int count =1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==count) count++;
            else if(nums[i]>count) return count;
        }
         return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna