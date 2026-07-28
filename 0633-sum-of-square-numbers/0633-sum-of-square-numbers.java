class Solution {
    public boolean judgeSquareSum(int c) {
         int lo=0;
         long hi=(long)Math.sqrt(c);
         while(lo<=hi){
            long cur=lo*lo+hi*hi;
            if(cur<c){
                lo++;
            }
                else if(cur>c){
                    hi--;
                }
                else{
                     return true;
                }

         }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna