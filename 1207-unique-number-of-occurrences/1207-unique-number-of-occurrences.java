class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for (int key : map.keySet()) {
            int val = map.get(key);
            set.add(val);
        }

        if (map.size() == set.size()) {
            return true;
        } else {
            return false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna