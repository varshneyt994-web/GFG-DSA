class Solution {
    public int largestAltitude(int[] arr) {
         int n=arr.length;
        int[] ans=new int[n+1];
          ans[0]=0;
         for(int i=0;i<n;i++){
            ans[i+1]=arr[i]+ans[i];
         }
        int max=ans[0];
        for(int i=0;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];

            }
        }
         return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna