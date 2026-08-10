class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int max=0;
         for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
         }
          ArrayList<Boolean> ans=new ArrayList<>();
          for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
          }
           return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna