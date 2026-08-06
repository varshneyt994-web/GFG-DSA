class Solution {
    public int findSpecialInteger(int[] arr) {
         int count =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
            count++;
        }
         else {
            count=1;
         }
     
         if(arr.length/4<count){
        
         return arr[i];

         }
    } 
     return arr[0];
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna