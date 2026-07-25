class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        for(int i=1;i<=n-2;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i;
        }
         return 234;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna