class Solution {
    public int missingInteger(int[] nums) {
         int sum=nums[0];
         for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
         }
          HashSet<Integer> set=new HashSet<>();
          for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
          }
           while(set.contains(sum)){
            sum++;
           }
            return sum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna