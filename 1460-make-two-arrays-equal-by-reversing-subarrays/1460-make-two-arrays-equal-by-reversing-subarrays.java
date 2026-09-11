class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
            Arrays.sort(arr);
            Arrays.sort(target);
            
            for(int i=0;i<target.length;i++){
                if(target[i]!=arr[i]){
                    return false ;
                }
            }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna