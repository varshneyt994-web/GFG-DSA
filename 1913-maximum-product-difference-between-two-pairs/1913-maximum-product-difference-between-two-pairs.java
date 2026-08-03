class Solution {
    public int maxProductDifference(int[] arr) {
         
        
         int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int index=-1;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
                 index=i;  
            } 
         }
             for(int i=0;i<arr.length;i++){
             if(arr[i]>max2 && i!=index ){
                max2=arr[i];
            }
         }

             for(int i=0;i<arr.length;i++){
             if(arr[i]<min1){
                min1=arr[i];
                 index=i;
             }  
         }  
            for(int i=0;i<arr.length;i++){
            if(arr[i]<min2 && i!=index ){
                min2=arr[i];
            }
             }
         
         return(max1*max2)-(min1*min2);
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna