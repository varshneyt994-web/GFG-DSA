class Solution {
    public int[] sortArrayByParityII(int[] nums) {
         int i=0;
         int j=1;
         int n=nums.length;
         while(i<n && j<n){
            if(nums[i]%2==0)
            i+=2;
            
            else if(nums[j]%2==1)
                j+=2;
            
             else {
                 int temp=nums[i];
                 nums[i]=nums[j];
                 nums[j]=temp;
             }
         }
        return nums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna