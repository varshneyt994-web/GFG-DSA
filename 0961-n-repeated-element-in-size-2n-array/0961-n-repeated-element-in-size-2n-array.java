class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1])

        
        return nums[i];
        }
        return -1;
        //  HashMap<Integer,Integer> map= new HashMap<>();
        //  for(int i=0;i<nums.length;i++){
        //    if(map.containsKey(nums[i]))
        //     map.put(nums[i],map.get(nums[i])+1);
        //    else
        //         map.put(nums[i],1);


        //  }
        //  for(int i:map.keySet()){
        //     if(map.get(i)==nums.length/2)
        //      return i;
        //  }

        //  return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna