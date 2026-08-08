class Solution {
    public int subarraySum(int[] nums, int k) {
         int n=nums.length;
         int count =0;
         for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
            sum+=nums[j];
           
            if(sum==k){
            count++;
         }
           }
         }
          return count ;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna