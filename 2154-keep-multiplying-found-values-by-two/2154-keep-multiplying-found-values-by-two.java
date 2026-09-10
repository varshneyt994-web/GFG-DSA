class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        for(int ele:nums){
         if(set.contains(original))
            original*=2;
            //  break;
        } 
        return original;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna