import java.util.Arrays;

class Solution {
    int majorityElement(int arr[]) {

        Arrays.sort(arr);

        int count = 1;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > arr.length / 2) {
                return arr[i];
            }
        }

        // Single element case
        if (arr.length == 1) {
            return arr[0];
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna