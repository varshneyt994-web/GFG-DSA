class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int t) {
         if(t<=1) return 0;
         int i=0;
          int n=nums.length;
           int count =0;
          int pro =1;
          for(int j=0;j<n;j++){
          pro*=nums[j];

             while(pro>=t){
              
            pro/=nums[i];
            i++;
          }
          count +=j-i+1;
          }
         
        return count;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna