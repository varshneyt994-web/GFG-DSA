class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;

        // for (int i = 0; i < n; i++) {
        //     if (nums[i] == target) {
        //         return i;
        //     }
        // }
         int lo=0,hi=n-1;
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<=arr[hi]){
                if(target>=arr[mid] && target<=arr[hi]) lo=mid+1;
                else hi=mid-1;
            }
             else{
                if(target>= arr[lo] && target<arr[mid]) hi=mid-1;
                 else lo=mid+1;
             }
         }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna