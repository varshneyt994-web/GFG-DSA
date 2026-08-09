class Solution {
    public boolean isAnagram(String s, String t) {
    // char[] a=s.toCharArray();
    // if(s.length()!=t.length()) return false;
    // char[] b=t.toCharArray();
    // Arrays.sort(a);
    //  Arrays.sort(b);
    //  for(int i=0;i<a.length;i++){
    //     if(a[i]!=b[i])return false;  
    //  }
    //  return true; 

  HashMap<Character, Integer> smap = new HashMap<>();
  if(s.length()!=t.length()) return false;
     for (int i = 0; i < s.length(); i++) {
     char key = s.charAt(i);
     if (smap.containsKey(key)) {
        int freq = smap.get(key);
        smap.put(key, freq + 1);
    } else {
        smap.put(key, 1);
    }
}
       HashMap<Character, Integer> tmap = new HashMap<>();
       for (int i = 0; i < t.length(); i++) {
       char key = t.charAt(i);
         if (tmap.containsKey(key)) {
        int freq = tmap.get(key);
        tmap.put(key, freq + 1);
    } else {
        tmap.put(key, 1);
    }
}
    for (int i = 0; i < t.length(); i++) {
    char key = t.charAt(i);
    if (!smap.containsKey(key) || !smap.get(key).equals(tmap.get(key))) {
        return false;
    }
}

return true;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna