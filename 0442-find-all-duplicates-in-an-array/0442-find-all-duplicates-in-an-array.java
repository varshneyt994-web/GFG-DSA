class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();

         Arrays.sort(nums);
        
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
            }
         }
          
        return(ans);
         
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna