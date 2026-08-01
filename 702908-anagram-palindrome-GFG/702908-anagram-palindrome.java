class Solution {
    boolean canFormPalindrome(String s) {

        int[] freq = new int[26];

        int i = 0;
        while (i < s.length()) {
            freq[s.charAt(i) - 'a']++;
            i++;
        }

        int odd = 0;
        for (i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0)
                odd++;
        }

        return odd <= 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna