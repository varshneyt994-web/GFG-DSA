class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
         int n=nums.length;
        for(int i=0;i<n-1;i=i+2){
            if(nums[i]!=nums[i+1]){
         return  nums[i];   
        }
  }   
  return nums[n-1];   
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna