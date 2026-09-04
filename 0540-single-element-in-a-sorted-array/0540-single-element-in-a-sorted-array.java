class Solution {
    public int singleNonDuplicate(int[] arr) {
    //      for(int i=0;i<arr.length;i++){
    //         int count=0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //             count++;
    //         }
    //          if(count>1){
    //             break;
    //          }
    //      }
    //     if(count==1){
    //     return arr[i];
    // }
    //      }
    //      return -1;
      
   

        for(int i = 0; i < arr.length; i++) {
               int count = 1;
              if(i > 0 && arr[i] == arr[i - 1]) {
                count++;
             }
               if(i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
            }

            if(count == 1) {
                return arr[i];
            }
        }

        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna