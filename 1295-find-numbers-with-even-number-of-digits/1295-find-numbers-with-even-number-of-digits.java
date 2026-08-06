class Solution {
    public int Count(int x){
        int c=0;
        while(x>0){
            x/=10;
            c++;
        }
        return c;
    }


    public int findNumbers(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(Count(nums[i])%2==0)
            n++;
        }
        return n;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna