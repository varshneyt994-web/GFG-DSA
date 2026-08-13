class Solution {
    public int missingMultiple(int[] nums, int k) {
         int n=nums.length;
         int multiple=k;
         Arrays.sort(nums);
         for(int i=0;i<n;i++){
            if(nums[i]==multiple){
                multiple=multiple+k;
            }
             
         
              
         }
          return multiple;
    }  
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna