class Solution {
    public int mySqrt(int n) {
        long lo=0,hi=n;
        while(lo<=hi){
            long mid= (lo+hi)/2;
            if(mid*mid==n) return (int)mid;
            else if(mid*mid>n) hi=mid-1;
            else 
           lo= mid+1;

        }
         return (int)hi;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna