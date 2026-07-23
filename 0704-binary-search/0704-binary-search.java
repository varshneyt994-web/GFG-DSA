class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        boolean flag=false;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]>target) hi=mid-1;
        else if(arr[mid]<target) lo=mid+1;
        }
        return -1;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna