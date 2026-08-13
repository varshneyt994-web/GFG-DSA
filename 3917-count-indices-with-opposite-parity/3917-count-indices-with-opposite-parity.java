class Solution {
    public int[] countOppositeParity(int[] nums) {
        
         int n=nums.length;
         int ans[] =new int[n];
         int evencount=0;
         int oddcount=0;
         for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                evencount++;
            }
             else{
                oddcount++;
             }
         
         }
            for(int i=0;i<n;i++){
                if(nums[i]%2==0){
                    evencount--;
                    ans[i]=oddcount;
                }
                 else{
                    oddcount--;
                    ans[i]=evencount;
                 }
            }
          return ans;
         }
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna