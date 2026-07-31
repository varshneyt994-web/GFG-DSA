class Solution {
     public int sqrt(long n){
          if(n==0 ) return 0;
         long lo=0,hi=n;
         while(lo<=hi){
        long mid=lo+(hi-lo)/2;
            if(mid==n/mid) return (int)mid;
            else if(mid>n/mid) hi=mid-1;
             else
             lo=mid+1;
         }
         return (int)hi;
     }
    public int arrangeCoins(int n) {

        // for(int row = 1; ; row++) {
        //     n = n - row;

        //     if(n < 0) {
        //         return row - 1;
        //     }
        // }
       return (sqrt(8L * n + 1) - 1) / 2;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna