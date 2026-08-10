class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
         ArrayList<Integer> ans = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            ans.add(index[i],nums[i]);
         }
        for(int i=0;i<ans.size();i++)
            nums[i]=ans.get(i);
        
         return nums;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna