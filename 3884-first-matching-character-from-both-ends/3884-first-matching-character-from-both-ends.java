class Solution {
    public int firstMatchingIndex(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-i-1)){
                return i;
            }
        }
         return -1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna