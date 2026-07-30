class Solution {
    public int maximumCount(int[] nums) {
         int n=nums.length;
         int negative=0;
         int positive=0;
         for(int i=0;i<n;i++){
            if(nums[i]>0){
                positive ++;
                
            }
             else if(nums[i]<0){
                negative++;
             } 
         }
             if(positive>negative){
                return positive;
             }
              else{
                return negative;
              }

         }
        
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna