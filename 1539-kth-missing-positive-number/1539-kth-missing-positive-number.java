class Solution {
    public int findKthPositive(int[] arr, int k) {
         int lo=0;
         int hi=arr.length-1;
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k)
            lo=mid+1;
            else
            hi=mid-1;

         }
          return lo+k;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna