class Solution {
    public int differenceOfSum(int[] nums) {
         int n=nums.length;
         int sum=0;
         for(int i=0;i<n;i++){
            sum+=nums[i];
            
         }
         // int digitsum(int[] nums){
            int totalsum=0;
             for(int i=0;i<n;i++){
              int m=nums[i];
            int digitsum=0;
                while(m>0){
                    digitsum+=m%10;
                    m/=10;

                }
                totalsum+=digitsum;
            }
            return sum-totalsum;

          }
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna