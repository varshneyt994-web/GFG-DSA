class Solution {
    public int heightChecker(int[] arr) {
        int[] ans=Arrays.copyOf(arr,arr.length);
        Arrays.sort(ans);
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=ans[i]){
                count++;
            }

        }
        return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna