class Solution {
    public int longestSubarray(int[] arr) {
        int n=arr.length;
        int i=0,j=0;
       int z=0;
       for(int ele:arr){
        if(ele==0) z++;
       }
       if(z==0) return n-1;
       int maxlen=0;
       int zeroes=0;
      while(i<n && arr[i]==0) i++;
      if(i==n) return 0;
      j=i;
      while(j<n){
        if(arr[j]==1) j++;   
        else{                  // arr[j]==0
            if(zeroes==0){
            j++;
            zeroes++;
        }
         else{            // zeroes=1
            int len=j-i-1;
            maxlen=Math.max(len,maxlen);
            j++;
            while(i<n && arr[i]==1) i++;
            i++;
         }
      }
  } 
    
    if(zeroes==0) return j-i;
     int len=j-i-1;
     maxlen=Math.max(len,maxlen);
      return maxlen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna