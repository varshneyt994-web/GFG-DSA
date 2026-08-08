class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
         return set.size();
    }
       
        public int reverse(int n){
            int rev=0,rem;
            while(n!=0){
                 rem=n%10;
                 rev=rev*10+rem;
                 n/=10;
            }
             return rev;
        }

        
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna