class Solution {
    public boolean divideArray(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                return false ;
            }
        }
                      return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna