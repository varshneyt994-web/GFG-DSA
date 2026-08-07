class Solution {
    public int[] productExceptSelf(int[] nums) {
        //  int product=1;
        //   int[] arr=new int[nums.length];
        //  for(int i=0;i<nums.length;i++){
        //     product*=nums[i];
        //  }
        //   for(int i=0;i<nums.length;i++){
        //     arr[i]=product/nums[i];
            
        //   }
        //   return arr;
        int n=nums.length;

         int[] pre=new int[n];
           pre[0]=1;
         for(int i=1;i<n;i++){
            pre[i]=nums[i-1]*pre[i-1];

         }
          int[] suff=new int[n];
          suff[n-1]=1;
          for(int i=n-2;i>=0;i--){
            suff[i]=nums[i+1]*suff[i+1];
          }
           int[] ans=new int[n];
           for(int i=0;i<n;i++){
            ans[i]=pre[i]*suff[i];
           }
            return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna