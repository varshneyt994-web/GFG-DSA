class Solution {
    public boolean isAnagram(String s, String t) {
    char[] a=s.toCharArray();
    if(s.length()!=t.length()) return false;
    char[] b=t.toCharArray();
    Arrays.sort(a);
     Arrays.sort(b);
     for(int i=0;i<a.length;i++){
        if(a[i]!=b[i])return false;  
     }
     return true;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna