class Solution {
    public int maxProduct(int[] nums) {
          int first=0;
          int second=0;
         int n =nums.length;
         for(int i =0;i<n;i++)
         if(nums[i]>first){
            second=first;
            first=nums[i];
         }
          else if (nums[i]>second){
           second=nums[i];

          }
          return (first-1)*(second-1);
         
        // Arrays.sort(nums);
        // return (nums[n-1]-1)*(nums[n-2]-1);

    }
        
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna