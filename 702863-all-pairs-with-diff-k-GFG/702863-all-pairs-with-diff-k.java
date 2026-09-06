class Solution {
    int countPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int ele : arr) {
            if (!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            }
        }

        int pairs = 0;

        // Count pairs
        for (int ele : map.keySet()) {

            int rem1 = ele - k;
            int rem2 = ele + k;

            if (map.containsKey(rem1)) {
                pairs += map.get(ele) * map.get(rem1);
            }

            if (map.containsKey(rem2)) {
                pairs += map.get(ele) * map.get(rem2);
            }
        }

        // Every pair counted twice
        pairs /= 2;

        return pairs;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna