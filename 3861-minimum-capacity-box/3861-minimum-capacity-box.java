class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
         int min=Integer.MAX_VALUE;
          int idx=-1;
          for(int i=0;i<capacity.length;i++){
             if(capacity[i]>=itemSize){
            if(capacity[i]<min){
                idx=i;
                min=capacity[i];
            }
        }
    }
    return idx;


        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna