class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        // for(int i=1;i<=n-2;i++){
        //     if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i;
        // }
        //  return 234;
          int lo=1,hi=n-2;
           while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) 
            return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) 
            lo=mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) 
            hi=mid-1;
             
           }
            return 7534537;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna