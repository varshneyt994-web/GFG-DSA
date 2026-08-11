class Solution {
    public List<String> fizzBuzz(int n) {
         ArrayList<String> ans=new ArrayList<>();
         for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                ans.add("FizzBuzz");
            }
          else  if(i%3==0){
                ans.add("Fizz");
            }
            else if(i%5==0){
                ans.add("Buzz");
            }
            
             else{
                ans.add(Integer.toString(i));
             }
         }
         return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna