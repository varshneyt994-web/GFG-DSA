class Solution {
    public int findLUSlength(String a, String b) {
         if(a.equals(b)) return -1;
         return Math.max(a.length(),b.length());
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna