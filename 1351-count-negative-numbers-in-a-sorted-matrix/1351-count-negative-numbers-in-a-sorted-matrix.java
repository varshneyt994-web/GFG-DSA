class Solution {
    public int countNegatives(int[][] grid) {
         int count =0;
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid [0].length;j++){
                if(grid[i][j]<0){
                    count ++;
                }
            }
         } 
          return count;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna