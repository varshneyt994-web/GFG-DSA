class Solution {
    public int[] finalPrices(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        int j;
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
            j=i+1;
            while(j<n){
                if(arr[j]<=arr[i]){
                ans[i]=arr[i]-arr[j];
                break;
  
            }
            j++;
        }
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna