class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
         int n=arr.length;
          int i=0;
          int j=k-1;
         int count=0;
         int sum=0;
         for(int a=0;a<=k-1;a++){
            sum+=arr[a];
         }
          if(sum/k>=t)
            count ++;
            i++;
            j++;
          
           while(j<n){
            sum=sum-arr[i-1]+arr[j];
             if(sum/k>=t)
            count ++;
            i++;
            j++;
          
           }
         
          return count ;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna