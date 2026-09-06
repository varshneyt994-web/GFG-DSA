class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        for(char ch: jewels.toCharArray()){
            set.add(ch);
        }
        int count=0;
           for(char ch: stones.toCharArray()){
            
            if(set.contains(ch))
            count++;
           }
            return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna