class Solution {
    public int maxOperations(int[] arr, int k) {
         int n=arr.length;
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]==k){
                count++;
                i++;
                j--;
            }
             else if(arr[i]+arr[j]<k){
                 i++;
                 }

             else j--;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna