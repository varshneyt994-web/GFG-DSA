class Solution {
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
         int n=nums.length;
        ans.add(nums[0]);
        for(int i=1;i<n-1;i++){
            boolean left=true,right=true;
            for(int j=i+1;j<n;j++){
                if(nums[j]>=nums[i]) {
                    right=false;
                    break;
                }
            }
            for(int j=0;j<i;j++){
                if(nums[j]>=nums[i]) {
                    left=false;
                    break;
                }
            }
            if(right||left) ans.add(nums[i]);
        }
        if(n>1) ans.add(nums[n-1]);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna