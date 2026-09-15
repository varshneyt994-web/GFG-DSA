class Solution {
    public int findLHS(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
         int j=0;
         int maxlength=0;
        for(int i=0;i<n;i++){
            while(arr[i]-arr[j]>1){
                j++;
            }
                if(arr[i]-arr[j]==1){
                    maxlength=Math.max(maxlength,i-j+1);
                }
            }
        return maxlength;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna