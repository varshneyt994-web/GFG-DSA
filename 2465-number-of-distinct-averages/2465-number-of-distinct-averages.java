class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        double[] ans=new double[n/2];
         
        Arrays.sort(nums);
         int i=0;
         int j=n-1;
          int k=0;
        
       while(i<j){
        int small=nums[i];
        int larg=nums[j];
         double avg=(small+larg)/2.0;
         ans[k]=avg; 
         k++;
         i++;
         j--;

       }
       Arrays.sort(ans);
       double f=-1;
       int count=0;
       for(int x=0;x<ans.length;x++){
        if(ans[x]!=f){
            count++;
            f=ans[x];
        }
       }
       return count;
         
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna