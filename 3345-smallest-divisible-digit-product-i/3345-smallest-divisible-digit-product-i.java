class Solution {
     int product(int n){
        int pro=1;
        while(n>0){
            pro*=n%10;
            n/=10;
        }
         return pro;
     }
    public int smallestNumber(int n, int t) {
         while(product(n)%t!=0){
            n++;
         }
          return n;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna