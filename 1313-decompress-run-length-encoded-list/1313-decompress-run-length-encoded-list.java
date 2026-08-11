class Solution {
    public int[] decompressRLElist(int[] arr) {
         int feq=0, val=1;
         ArrayList<Integer> al=new ArrayList<>();
           while(val<=arr.length){
          for(int i=0;i<arr[feq];i++){
          
                al.add(arr[val]);
            }
            val+=2;
            feq+=2;

         }
        int[] ans=new int[al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);

        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna