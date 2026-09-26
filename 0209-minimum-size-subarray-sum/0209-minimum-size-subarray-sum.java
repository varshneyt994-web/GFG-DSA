class Solution {
    public int minSubArrayLen(int t, int[] nums) {
         int i=0;
          int n=nums.length;
          int sum =0;
          int ans=Integer.MAX_VALUE;
          for(int j=0;j<n;j++){
            sum+=nums[j];

             while(sum>=t){
            ans=Math.min(ans,j-i+1);
            sum-=nums[i];
            i++;
          }
          }
           if (ans == Integer.MAX_VALUE) {
            return 0;
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna