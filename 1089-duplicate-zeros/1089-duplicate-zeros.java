class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                ans.add(arr[i]);
            }
            else{
                ans.add(0);
                ans.add(0);
            }
             if(ans.size()==arr.length)
             break;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna