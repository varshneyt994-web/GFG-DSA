class Solution {
    public char findTheDifference(String s, String t) {
     
     char[] a = s.toCharArray();
     char[] b = t.toCharArray();
      Arrays.sort(a);
        Arrays.sort(b);
         for(int i=0;i<s.length();i++){
            if(a[i]!=b[i]){
            return b[i];
         }
         
         }
        
        return b[b.length-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna