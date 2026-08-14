class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
         for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k)
                    count++;

        
         }
         }
          return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna