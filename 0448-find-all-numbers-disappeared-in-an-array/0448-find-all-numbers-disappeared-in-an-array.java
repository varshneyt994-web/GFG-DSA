class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) { 
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0)
            nums[index]=-nums[index];

        } for(int i=0;i<nums.length;i++){
         if(nums[i]>0){
            arr.add(i+1);
         }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna