class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
         int n=nums.length;
        int[] arr=new int[2];
         int k=0;
        for(int i=0;i<n;i++){
            if(i==n-1 ||nums[i]!=nums[i+1]){
                arr[k]=nums[i];
                k++;
            }
             else i++;
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna