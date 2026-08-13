class Solution {
    public int alternatingSum(int[] nums) {
         int n=nums.length;
         int sum1=0;
         int sum2=0;
        for(int i=0;i<n;i+=2){
            sum1+=nums[i];
        }
         for(int i=1;i<n;i+=2){
            sum2+=nums[i];
         } 
         int diff=sum1-sum2;
          return diff;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna