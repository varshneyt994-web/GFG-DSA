class Solution {
    public int[] sortedSquares(int[] nums) {
         int n=nums.length;
         int[] arr=new int[n];
         int left=0;
         int right=n-1;
          int k=n-1;
          while(left<=right){
            int leftsequre=nums[left]*nums[left];
            int rightsequre=nums[right]*nums[right];
            if(leftsequre>rightsequre){
                arr[k]=leftsequre;
                 left ++;
                 k--;
            }
             else{
                arr[k]=rightsequre;
                right --;
                k--;
             }
          }
           return arr;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna