class Solution {
    public int[] getConcatenation(int[] nums) {
         int n=nums.length;
         int[] arr=new int[2*n];
         int j=0;
         for(int i=0;i<2*n;i++){
            if(i<n){
                arr[i]=nums[i];
            }
             else {
                arr[i]=nums[j++];
             }
         }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna