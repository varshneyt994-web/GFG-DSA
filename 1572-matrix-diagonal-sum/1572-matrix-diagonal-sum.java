class Solution {
    public int diagonalSum(int[][] arr) {
         int sum=0;
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
                if(i==j || i+j==arr.length-1){
                   sum+=arr[i][j];

                }
             }

        }
         return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna