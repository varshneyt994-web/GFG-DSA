class Solution {
    public int hammingWeight(int n) {
         int count =0;
         int m=n;
         while(n!=0){
            m=n%2;
            count+=m;
           
            n/=2;
         }
         return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna