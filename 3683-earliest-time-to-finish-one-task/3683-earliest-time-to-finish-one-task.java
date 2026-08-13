class Solution {
    public int earliestTime(int[][] tasks) {
         int n=tasks.length;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<2;j++){
            sum+=tasks[i][j];
        }
        min=Math.min(min,sum);

    }
     return min;
        


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna